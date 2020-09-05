package com.line.demo.sbkafkaproducer;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@SpringBootTest
public class SbKafkaProducerApplicationTests {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    //自定义topic
    public static final String TOPIC_ONE = "test";

    @Test
    public void send() {
        //发送消息
        ListenableFuture<SendResult<String, Object>> future = kafkaTemplate.send(TOPIC_ONE, "DDD");
//        future.addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {
//            @Override
//            public void onFailure(Throwable throwable) {
//                //发送失败的处理
//                System.out.println(TOPIC_ONE + " - 生产者 发送消息失败：" + throwable.getMessage());
//            }
//
//            @Override
//            public void onSuccess(SendResult<String, Object> stringObjectSendResult) {
//                //成功的处理
//                System.out.println(TOPIC_ONE + " - 生产者 发送消息成功：" + stringObjectSendResult.toString());
//            }
//        });


    }


}
