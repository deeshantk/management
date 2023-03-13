package com.manufacturer.manufacturer.kafka;

import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "CoreTopic",
                    groupId = "groupId"
    )
    void listener(String data){
        System.out.println("Linstner received: "+ data);
    }
}
