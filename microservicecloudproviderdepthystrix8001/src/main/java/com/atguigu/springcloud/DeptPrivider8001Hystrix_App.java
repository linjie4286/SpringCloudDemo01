package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
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
@EnableCircuitBreaker  //对Hystrix熔断机制的支持
public class DeptPrivider8001Hystrix_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptPrivider8001Hystrix_App.class, args);
    }
}
