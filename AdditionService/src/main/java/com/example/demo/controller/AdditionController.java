package com.example.demo.controller;

import com.example.demo.service.AdditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms1")
public class AdditionController {

    @Autowired
    private AdditionService service;

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        int result = service.add(a, b);
        return "MS 1.1 - Additon = " + result;
    }
}
