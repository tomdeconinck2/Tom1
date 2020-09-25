package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

// Zoek de orderservice in eureka. Lukt het niet? Ge dan naar deze fallback class
@FeignClient(name = "order-service", fallback = OrderClientFallback.class)

public interface OrderClient {
    @GetMapping("/")
    Object getOrdersForCustomer(@RequestParam int customerId);
}
