package com.yusys.springcloud.stream.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * Created by huyang on 2019/10/17.
 */
@Component
@EnableBinding(value = {StreamClient.class})
public class StreamReceiver {

    private Logger logger = LoggerFactory.getLogger(StreamReceiver.class);

    @StreamListener(StreamClient.INPUT)
    public void receive(String message) {
        logger.info("StreamReceiver: {}", message);
    }
}
