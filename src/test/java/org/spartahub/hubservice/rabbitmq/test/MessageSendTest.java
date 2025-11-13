package org.spartahub.hubservice.rabbitmq.test;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class MessageSendTest {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    void test() {
        ProductMessage message = new ProductMessage("테스트 메세지2", LocalDateTime.now());
        rabbitTemplate.convertAndSend("sparta", "product.test", message);
    }

}
