package com.spring.openshift.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CalculatorApplication {

		
	@GetMapping("/")
		public String welcome() {
			return "Welcome to Calculator <a href='/calc'>Calculator</a>";
		}
	
	@GetMapping("/{input}")
	public String welcomeMsg(@PathVariable String input) {
		return "Hi "+input+" Your Application Deployed successfully... ";
	}


	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
