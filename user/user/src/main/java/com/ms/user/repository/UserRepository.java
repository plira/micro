package com.ms.user.repository;

import com.ms.user.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {

    @Query(value = "select * from tb_users  u where u.name like %:name%", nativeQuery = true)
    Optional<UserModel> existsByNomeItem(String name);
}
