package com.manufacturer.manufacturer.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;

public class ManufacturerService {

    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
        return args -> {
            kafkaTemplate.send("CoreTopic", "post in Vendor");
            kafkaTemplate.send("CoreTopic", "post in Rto");
            kafkaTemplate.send("CoreTopic", "post in PublicVehicles");
        };
    }


}
