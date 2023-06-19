package com.cemilbayhan.producer.controller;

import com.cemilbayhan.producer.model.Message;
import com.cemilbayhan.producer.service.KafkaProducer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class KafkaController {
    private final KafkaProducer kafkaProducer;

    @PostMapping("/send")
    public void sendMessageToKafkaTopic(@RequestBody Message message) {
        this.kafkaProducer.sendMessage(message);
    }
}