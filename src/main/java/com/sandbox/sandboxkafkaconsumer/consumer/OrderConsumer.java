package com.sandbox.sandboxkafkaconsumer.consumer;

import com.sandbox.sandboxkafkaconsumer.model.Order;
import lombok.extern.java.Log;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Log
public class OrderConsumer {

    @KafkaListener(
            topics = "${order.topics}",
            groupId = "group-id",
            containerFactory = "kafkaListenerContainerFactory",
            autoStartup = "true")
    public void consumer(@Payload Order record){

//        log.info(" descriptin "+ record.get(0).getDescription());
//        log.info(" value "+record.get(0).getValue());
        log.info(" description "+ record.getDescription());
        log.info(" value "+record.getValue());

    }

}
