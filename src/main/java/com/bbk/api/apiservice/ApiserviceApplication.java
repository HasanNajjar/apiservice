package com.bbk.api.apiservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class ApiserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiserviceApplication.class, args);
	}

	@GetMapping("/version")
	public Map<String, String> versionCheck() {
		HashMap<String, String> map = new HashMap<>();
		map.put("version", "VERSION_NUMBER");

		return map;
	}

}

