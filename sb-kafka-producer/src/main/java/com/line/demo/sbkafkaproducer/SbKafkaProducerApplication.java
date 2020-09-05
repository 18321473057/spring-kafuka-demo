package com.line.demo.sbkafkaproducer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

@SpringBootApplication
public class SbKafkaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbKafkaProducerApplication.class, args);
    }
}
