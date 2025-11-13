package org.spartahub.hubservice.infrastructure.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("hub-service")
public interface HubClient {

    @GetMapping("test3")
    String getTest3();
}
