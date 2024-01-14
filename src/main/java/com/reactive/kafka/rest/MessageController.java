package com.reactive.kafka.rest;

import com.reactive.kafka.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 14 Jan 2024
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/messages")
public class MessageController {

    private final KafkaProducer kafkaProducer;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message) {

        kafkaProducer.sendMessage(message);

        return ResponseEntity.ok("Message Queued Successfully ");

    }
}
