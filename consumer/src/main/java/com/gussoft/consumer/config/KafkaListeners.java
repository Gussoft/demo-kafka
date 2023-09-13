package com.gussoft.consumer.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

  @KafkaListener(topics = "primer-topic",
  groupId = "groupGM")
  void listener(String data) {
    System.out.println("Listener received: ".concat(data));
  }
}
