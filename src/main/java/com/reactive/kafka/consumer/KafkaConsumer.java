package com.reactive.kafka.consumer;

import com.reactive.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 14 Jan 2024
 */
@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "testing", groupId = "myGroup")
    public void consumeMsg(String msg) {

        log.info(String.format("Consuming the message from testing topic :: %s", msg));

    }

    @KafkaListener(topics = "testing", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {

        log.info(String.format("Consuming the message from testing topic :: %s", student.toString()));

    }
}
