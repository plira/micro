package com.ms.user.services.impl;

import com.ms.user.dtos.UserRecorDto;
import com.ms.user.model.UserModel;
import com.ms.user.repository.UserRepository;
import com.ms.user.services.UserServices;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserModel save(UserRecorDto dto) {
        try {


            if (this.userRepository.existsByNomeItem(dto.name()).isPresent()) {
                throw new BadRequestException("Item Já esta Cadastrado");

            }
            UserModel userModel = new UserModel();
            userModel.setName(dto.name());
            userModel.setEmail(dto.email());
            return userRepository.save(userModel);
        }catch (Exception ex ){


         System.out.println("Erro: "+ex.getMessage());



    }

        return null;

    }

    @Override
    public Optional<UserModel> existsByNomeItem(String name) {
        return this.userRepository.existsByNomeItem(name);
    }

    @Override
    public List<UserModel> findAll() {

        return userRepository.findAll();
    }
}
