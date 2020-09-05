package com.line.demo.sbkafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Controller;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: yangcs
 * @Date: 2020/9/4 17:02
 * @Description:
 */
@Controller
@RequestMapping("/test")
public class TestC {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("/a")
    @ResponseBody
    public String X() {
        ListenableFuture<SendResult<String, Object>> future = kafkaTemplate.send("test", "DDD");
        return "DADS";
    }

}
