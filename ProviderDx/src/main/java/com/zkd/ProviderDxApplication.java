package com.zkd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderDxApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDxApplication.class, args);
    }
}
