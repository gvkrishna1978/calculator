package com.spring.openshift.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	
	
	 @RequestMapping("/")
	public String welcome() {
		return "Welcome to Calculator <a href='/calc'>Calculator</a>";
	}

}
