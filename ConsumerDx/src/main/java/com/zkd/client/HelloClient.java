package com.zkd.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ProviderDx")
public interface HelloClient {
    @GetMapping("/hello")
    public String hello();
}
