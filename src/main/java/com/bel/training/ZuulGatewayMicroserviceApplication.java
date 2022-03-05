package com.bel.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
//@RibbonClients(defaultConfiguration = RibbonEurekaClientConfig.class)
public class ZuulGatewayMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayMicroserviceApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	} 
}
