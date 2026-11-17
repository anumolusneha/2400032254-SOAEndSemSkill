package com.example.demo.service;

import com.example.demo.entity.Addition;
import com.example.demo.repository.AdditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdditionService {

    @Autowired
    private AdditionRepository repository;

    public int add(int a, int b) {
        Addition addition = new Addition(a, b, 0);
        return repository.add(addition);
    }
}
