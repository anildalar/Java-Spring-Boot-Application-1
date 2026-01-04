package com.example.demo.controller.api.v2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController2 {
    @GetMapping("/health")
    public String health() {
        return "OK - v2";
    }
}
