package com.formacion.springboot.app.libro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.formacion.springboot.app.common.models.entity"})
public class SpringBootLibrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibrosApplication.class, args);
	}

}
