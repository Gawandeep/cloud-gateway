package com.example.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class GatewayController {
	
	@RequestMapping("/orderFallback")
	public Mono<String> orderFallback(){
		return Mono.just("Order Service is taking too long to respond or is down. Please try again later.");
	}

	@RequestMapping("/paymentFallback")
	public Mono<String> paymentFallback(){
		return Mono.just("Payment Service is taking too long to respond or is down. Please try again later.");
	}
}
