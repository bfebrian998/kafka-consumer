package com.example.kafka.consumer.service;

import org.springframework.stereotype.Service;

@Service
public class KafkaConsumeService {
    
    public String consumeMessage(String message) {
        System.out.println("Received message: " + message);

        return "Success ke Consumer ";
    }
}
