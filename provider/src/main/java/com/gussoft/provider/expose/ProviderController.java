package com.gussoft.provider.expose;

import com.gussoft.provider.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProviderController {

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  @PostMapping("/messages")
  public void send(@RequestBody Message message) {
    kafkaTemplate.send("primer-topic", message.getPayload());
  }

}
