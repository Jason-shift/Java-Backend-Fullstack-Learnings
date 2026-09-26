package com.example.simple.kafka.controller;

import com.example.simple.kafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class KafkaController {

    @Autowired
    Producer producer;

    @GetMapping("send")
    public void sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
    }

}
