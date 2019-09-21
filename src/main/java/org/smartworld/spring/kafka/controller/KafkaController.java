package org.smartworld.spring.kafka.controller;


import org.smartworld.spring.kafka.model.MessageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, MessageModel> kafkaTemplate;

    @PostMapping
    public void postMessage(@RequestBody MessageModel messageModel){

        kafkaTemplate.send("msgTopic", messageModel);
    }

    @KafkaListener(topics = "msgTopic")
    public void consumeKafka(@org.jetbrains.annotations.NotNull MessageModel messageModel){
        System.out.println(messageModel.toString());
    }

}
