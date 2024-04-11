package com.ms.user.services;

import com.ms.user.dtos.UserRecorDto;
import com.ms.user.model.UserModel;
import com.ms.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface UserServices {

    public UserModel save(UserRecorDto dto);

    public Optional<UserModel> existsByNomeItem(String name);

}
