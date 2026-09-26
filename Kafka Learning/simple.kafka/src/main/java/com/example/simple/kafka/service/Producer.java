package com.example.simple.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        System.out.println("Sending message to simple-message-topic");
        kafkaTemplate.send("simple-message-topic", message);
    }

}
