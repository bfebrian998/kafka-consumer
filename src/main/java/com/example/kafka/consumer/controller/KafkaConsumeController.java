package com.example.kafka.consumer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class KafkaConsumeController {

    @PostMapping("/send-consumer")
    public String consume() {
        
        System.out.println("consume");
        return "";
    }
    
}
