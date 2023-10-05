package com.example.demo.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.TrainRepository;
import com.example.demo.entity.Train;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainRepository trainRepository;

    @Override
    public Train createTrain(Train train) {
        return trainRepository.save(train);
    }

    public Train updateTrain(Train train) {
        return trainRepository.save(train);
    }

    @Override
    public void deleteTrain(Long trainId) {
        trainRepository.deleteById(trainId);
    }

    @Override
    public Train getTrainById(Long trainId) {
        return trainRepository.findById(trainId).orElse(null);
    }

    @Override
    public List<Train> getAllTrains() {
        return trainRepository.findAll();
    }
}
