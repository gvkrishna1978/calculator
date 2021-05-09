package com.spring.openshift.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class calcController {
	
	@RequestMapping("calc")
	
	public String calc()
	{
		return "calc.jsp";
	}

}
