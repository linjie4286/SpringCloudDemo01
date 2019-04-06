package com.atguigu.springcloud.cfgbean;

import com.atguigu.myrule.RandomRule_ZLJ;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * description
 * 等同于applicationContext.xml
 *
 * @author 赵林杰 2019/03/27 15:31
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced //Spring Cloud Ribbon是基于NetflixRibbon实现的一套客户端 负载均衡的工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        // return new RandomRule();
        return new RetryRule();
    }
}
