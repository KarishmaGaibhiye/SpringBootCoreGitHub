package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ApplicationController {

    @GetMapping
    public String sayWelcome()
    {
        return "Welcome to csi pune";
    }

    @GetMapping("/services")
    public String sayServices()
    {
        return "Software application development";
    }
}
