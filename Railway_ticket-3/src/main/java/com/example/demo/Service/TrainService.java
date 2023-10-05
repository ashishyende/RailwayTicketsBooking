package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.TrainRepository;

@Service
public class TrainService {
    @Autowired
    private TrainRepository trainRepository;
    // Implement train-related business logic
}