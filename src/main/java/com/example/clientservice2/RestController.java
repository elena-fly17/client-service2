package com.example.clientservice2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/client")
public class RestController {

    @GetMapping("/test")
    public String getTestStringLoadBalancer() {
        return "Test string from client-service2";
    }
}