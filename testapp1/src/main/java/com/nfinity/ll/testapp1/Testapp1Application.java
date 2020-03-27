package com.nfinity.ll.testapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Testapp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Testapp1Application.class, args);
	}

}

