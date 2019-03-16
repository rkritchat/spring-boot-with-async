package com.example.async.service.user.impl;

import com.example.async.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    @Async
    public void generateAllUserWithAsync() {
        try {
            logger.info("Inside generateAllUserWithAsync Thread id is " + Thread.currentThread().getId());
            Thread.sleep(5000);
            logger.info("After sometime this line is execute");
        } catch (InterruptedException e) {
            logger.error("Exception occur, ", e);
        }
    }
}
