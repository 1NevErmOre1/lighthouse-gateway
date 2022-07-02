package com.lighthouse.gateway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.lighthouse.gateway.**"})
@EnableFeignClients(basePackages = {"com.lighthouse.gateway.**"})
public class LighthouseGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LighthouseGatewayApplication.class, args);
    }

}
