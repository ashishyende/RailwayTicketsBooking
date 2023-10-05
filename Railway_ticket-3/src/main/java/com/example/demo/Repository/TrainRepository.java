package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {
    // Add custom queries if needed
}