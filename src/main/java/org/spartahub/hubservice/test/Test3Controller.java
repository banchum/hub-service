package org.spartahub.hubservice.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test3Controller {

    @GetMapping("test1")
    public void test1(@RequestHeader(name="X-User-Id") String userId,
                      @RequestHeader(name="X-Username") String username) {


    }
}

