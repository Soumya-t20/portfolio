package com.example.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectsController {

    @GetMapping("/projects")
    public String showProjectsPage() {
        // Logic to display the projects page
        return "projects"; // Assuming you have a "projects.html" template
    }
}
