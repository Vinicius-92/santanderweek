package com.viniciusaugusto.santanderbackend;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SantanderBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderBackendApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenApi() {
		return new OpenAPI().info(new Info()
		.title("")
		.version("1.0")
		.termsOfService("http://swagger.io/terms")
		.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}
}
