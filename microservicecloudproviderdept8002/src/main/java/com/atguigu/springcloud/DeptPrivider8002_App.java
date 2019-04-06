package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * description
 *
 * @author 赵林杰 2019/03/27 14:41
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptPrivider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptPrivider8002_App.class, args);
    }
}
