package com.gussoft.consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

	@Bean
	CommandLineRunner inti(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> {
			kafkaTemplate.send("primer-topic", "Welcome to the Jungle!");
		};
	}
}
