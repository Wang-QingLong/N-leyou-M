package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version V1.0
 * @author: WangQingLong
 * @date: 2019/12/30 18:03
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LeYouItemServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeYouItemServiceApplication.class);
    }
}
