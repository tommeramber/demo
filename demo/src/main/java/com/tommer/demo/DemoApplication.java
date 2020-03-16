package com.tommer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String welcome(){
		return "Welcome Demo";
	}

	@GetMapping("/{input}")
	public String congrats(@PathVariable String input){
		return "hi "+input;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
