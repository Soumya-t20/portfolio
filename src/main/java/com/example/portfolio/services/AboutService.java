package com.example.portfolio.services;
import org.springframework.stereotype.Service;

@Service
public class AboutService {

    public String getAboutContent() {
        // Simulated logic to retrieve about content from a database
        return "Welcome to my portfolio. I'm passionate about...";
    }
}
