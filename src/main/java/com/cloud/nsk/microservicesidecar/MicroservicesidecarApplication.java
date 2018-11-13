package com.cloud.nsk.microservicesidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * 说明：@EnableSidecar注解整合以下三个注解：
 * 1.@EnableEurekaDiscoveryClient
 * 2.@EnableCircuitBreaker
 * 3.@EnableZuulProxy
 */
@EnableSidecar
@SpringBootApplication
public class MicroservicesidecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesidecarApplication.class, args);
	}
}
