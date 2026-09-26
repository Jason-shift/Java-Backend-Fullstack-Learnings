package com.example.simple.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "simple-message-topic", groupId = "simple-message-group")
    public void receiveMessage(String receivedMessage) {
        System.out.println("In class :: " + this.getClass().getName());
        System.out.println("Received Message :: " + receivedMessage);
    }
}
