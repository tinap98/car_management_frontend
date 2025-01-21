package com.example.car_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserHomeController {

    @GetMapping("/user/home")
    public String userHome() {
        return "user-home"; // Renders user-home.html
    }
}