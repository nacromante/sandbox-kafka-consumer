package com.sandbox.sandboxkafkaconsumer.consumer;

import lombok.extern.java.Log;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log
public class OrderConsumer {

    @KafkaListener(topics = "${order.topics}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(ConsumerRecord record){

        log.info(" key "+record.key());
        log.info(" content "+record.value());

    }

}
