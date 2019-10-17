package com.yusys.springcloud.stream.controller;

import com.yusys.springcloud.stream.entity.User;
import com.yusys.springcloud.stream.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huyang on 2019/10/17.
 */

@RestController
public class TestController {

    @Autowired
    private StreamClient streamClient;

    @RequestMapping("/send")
    public String send() {
        User user = new User("张三", "154shmj");
        System.out.println("send start");
        streamClient.output().send(MessageBuilder.withPayload("Hello World...").build());

//        streamClient.output().send(MessageBuilder.withPayload(user).build());
        System.out.println("send end");

        return "success";
    }
}
