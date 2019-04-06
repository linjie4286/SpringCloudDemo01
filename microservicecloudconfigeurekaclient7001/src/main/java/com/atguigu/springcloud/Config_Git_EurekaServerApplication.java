package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * description
 *
 * @author 赵林杰 2019/04/03 10:04
 */
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Config_Git_EurekaServerApplication.class, args);
    }
}
