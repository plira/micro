package com.ms.user.controller;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.ms.user.dtos.UserRecorDto;
import com.ms.user.model.UserModel;
import com.ms.user.services.UserServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    private UserServices userServices;

    @PostMapping("/users")
    public ResponseEntity<UserModel> saveItem(@RequestBody @Valid  UserRecorDto userDTO) {

               return ResponseEntity.ok(this.userServices.save(userDTO));

    }

    @GetMapping("/users")
    public ResponseEntity<List<UserModel>> ListdAll(){

        return  ResponseEntity.status(HttpStatus.OK).body(this.userServices.findAll());
    }



}
