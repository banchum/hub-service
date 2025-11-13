package org.spartahub.hubservice.infrastructure.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "org.spartahub.hubservice")
public class FeignConfig {

}
