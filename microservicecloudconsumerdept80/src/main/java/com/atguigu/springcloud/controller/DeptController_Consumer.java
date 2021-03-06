package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * description
 *
 * @author 赵林杰 2019/03/27 15:37
 */
@RestController
public class DeptController_Consumer {

    //private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/comsumer/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, boolean.class);
    }

    @RequestMapping(value = "/comsumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping(value = "/comsumer/dept/list")
    public List<Dept> list(){
           return  restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

    @RequestMapping(value = "/comsumer/dept/discovery")
    public Object discovery(){
        return  restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
    }
}
