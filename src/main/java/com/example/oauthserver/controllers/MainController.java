package com.example.oauthserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.oauthserver.Repository.UserRepository;
import com.example.oauthserver.Service.TokenService;
import com.example.oauthserver.model.User;

public class MainController {
    
    private final TokenService tokenService;

    @Autowired
    private UserRepository userRepository;

    public MainController(TokenService service) {
        this.tokenService = service;
    }

    @GetMapping("auth")
    public String token(Authentication authentication) {
        String token = tokenService.generateToken(authentication);
        return token;
    }

    @GetMapping("/public")
    public String publicPage() {
        return "Hello, this is public page";
    }

    @GetMapping("/private")
    public String privatePage() {
        return "Hello, pass authentication";
    }

    @PostMapping("/user")
    public String getUser(@RequestBody User user) {
        System.out.println(user);
        userRepository.findAll();
        return "5";
    }
}
