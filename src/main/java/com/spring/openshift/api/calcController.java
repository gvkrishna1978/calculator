package com.spring.openshift.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class calcController {
	
	@RequestMapping("calc")	
	public String calc()
	{
		return "calc.jsp";
	}
	
	
	
	

}
