package com.example.demo.repository;

import com.example.demo.entity.Addition;
import org.springframework.stereotype.Repository;

@Repository
public class AdditionRepository {
    public int add(Addition addition) {
        return addition.getA() + addition.getB();
    }
}
