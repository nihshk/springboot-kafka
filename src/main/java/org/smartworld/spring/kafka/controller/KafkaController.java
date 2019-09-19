package org.smartworld.spring.kafka.controller;


import org.smartworld.spring.kafka.model.MessageModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    public void postMessage(@RequestBody MessageModel messageModel){

    }
}
