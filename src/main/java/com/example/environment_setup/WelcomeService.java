package com.example.environment_setup;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Data
public class WelcomeService {

    @Value("${app.message}")
    private String message;

    @Value("${app.api.url}")
    private String apiUrl;

}
