package com.example.environment_setup;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class StatusController {

    private final WelcomeService welcomeService;

    @GetMapping("/status")
    public Map<String, String> getStatus() {
        Map<String, String> response = new HashMap<>();
        response.put("message", welcomeService.getMessage());
        response.put("apiUrl", welcomeService.getApiUrl());
        return response;
    }
}
