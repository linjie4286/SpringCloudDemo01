package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * description
 *
 * @author 赵林杰 2019/03/27 15:57
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.atguigu.springcloud"})
@ComponentScan("com.atguigu.springcloud")
//在启动微服务的时候就能去加载我们自定义Ribbon配置类，从而使配置生效
//@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer80_Feign1_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign1_App.class ,args);
    }
}
