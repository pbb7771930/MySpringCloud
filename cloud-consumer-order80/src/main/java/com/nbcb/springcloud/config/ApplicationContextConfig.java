package com.nbcb.springcloud.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther zzyy
 * @create 2020-02-18 17:27
 */
@Configuration  //相当于传统的xml配置文件
public class ApplicationContextConfig
{
    @Bean    //相当于XML中的,放在方法的上面，而不是类，意思是产生一个bean,并交给spring管理
    @LoadBalanced  //开启客户端负载均衡
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
//applicationContext.xml <bean id="" class="">