package com.ms.shared.api;

import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsSharedApiApplication {


	public static void main(String[] args) {
		MDC.put("app.name", "til-shared-api");
		SpringApplication.run(MsSharedApiApplication.class, args);
	}

}
