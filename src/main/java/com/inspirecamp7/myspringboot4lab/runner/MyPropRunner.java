package com.inspirecamp7.myspringboot4lab.runner;

import com.inspirecamp7.myspringboot4lab.config.MyEnvironment;
import com.inspirecamp7.myspringboot4lab.properties.MyPropProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyPropRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(MyPropRunner.class);

    @Value("${myprop.username}")
    private String username;

    @Value("${myprop.port}")
    private int port;

    @Autowired
    private MyPropProperties myPropProperties;

    @Autowired
    private MyEnvironment myEnvironment;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // 1-4. @Value
        logger.debug("========== 1-4. @Value ==========");
        logger.debug("username : {}", username);
        logger.debug("port : {}", port);

        // 1-5. @ConfigurationProperties
        logger.info("========== 1-5. @ConfigurationProperties ==========");
        logger.info("username : {}", myPropProperties.getUsername());
        logger.info("port : {}", myPropProperties.getPort());

        // 1-6. @Profile
        logger.info("========== 1-6. @Profile ==========");
        logger.info("mode : {}", myEnvironment.getMode());
    }
}