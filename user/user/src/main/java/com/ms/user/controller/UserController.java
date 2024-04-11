package com.ms.user.controller;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.ms.user.dtos.UserRecorDto;
import com.ms.user.model.UserModel;
import com.ms.user.services.UserServices;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
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
    private UserServices userServices;

    @PostMapping("/users")
    public ResponseEntity<UserModel> saveItem(@RequestBody @Valid @Email UserRecorDto userDTO) {

               return ResponseEntity.ok(this.userServices.save(userDTO));

    }
}
