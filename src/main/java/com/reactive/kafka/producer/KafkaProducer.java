package com.reactive.kafka.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 14 Jan 2024
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {

        log.info(String.format("Sending message to testing topic :: %s", msg));

        kafkaTemplate.send("testing", msg);

    }
}
