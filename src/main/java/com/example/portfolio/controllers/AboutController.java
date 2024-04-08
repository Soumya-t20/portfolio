package com.example.portfolio.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
    // Controller logic goes here
    @GetMapping("/about")
    public String showAboutPage() {
        // Logic to display the about page
        return "about"; // Assuming you have an "about.html" template in the "templates" directory
    }
}
