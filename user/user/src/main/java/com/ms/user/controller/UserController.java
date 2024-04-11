package com.ms.user.controller;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.ms.user.dtos.UserRecorDto;
import com.ms.user.model.UserModel;
import com.ms.user.services.UserServices;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @Autowired
    UserServices userServices;

    @PostMapping("/users")
    public ResponseEntity<UserModel> saverUser(@RequestBody @Valid UserRecorDto userRecordDro){

     UserModel  userModel = new UserModel();
        BeanUtils.copyProperties(userRecordDro,userModel);

        return  ResponseEntity.status(HttpStatus.CREATED).body(userServices.save(userModel));
        // teste de comit
    }

}
