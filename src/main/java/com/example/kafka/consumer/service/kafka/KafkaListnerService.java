package com.example.kafka.consumer.service.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListnerService {

    @KafkaListener(topics = "${spring.kafka.consumer.topic}", groupId = "${spring.kafka.group-id}")
    public void consume(String message) {

        System.out.println("Consumer data banget cobaaaaa" + message);
    }
}
