package com.spring.cloud.controller;

import com.spring.cloud.model.User;
import com.spring.cloud.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping(value = "")
    @Transactional
    public ResponseEntity<List<User>> findAllUser() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
