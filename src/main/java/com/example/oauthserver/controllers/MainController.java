package com.example.oauthserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
    
    @GetMapping("/public")
    public String publicPage() {
        return "Hello, this is public page";
    }

    @GetMapping("/private")
    public String privatePage() {
        return "Hello, pass authentication";
    }
}
