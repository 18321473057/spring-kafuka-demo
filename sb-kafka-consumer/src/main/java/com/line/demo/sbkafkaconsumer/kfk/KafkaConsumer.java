package com.line.demo.sbkafkaconsumer.kfk;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    // 消费监听
    @KafkaListener(topics = {"test"})
    public void listen1(String data) {
        System.out.println(data);
    }
}