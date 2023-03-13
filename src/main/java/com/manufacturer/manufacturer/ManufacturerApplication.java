package com.manufacturer.manufacturer;

import com.manufacturer.manufacturer.kafka.KafkaListeners;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class ManufacturerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManufacturerApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
//		return args -> {
////			for(int i=0; i<10; i++)
//				kafkaTemplate.send("CoreTopic", "post in Vendor NOW");
//		};
//	}

}
