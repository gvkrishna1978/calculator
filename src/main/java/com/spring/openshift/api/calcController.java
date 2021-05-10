package com.spring.openshift.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class calcController {
	
	@RequestMapping(path = "/calc" , method=RequestMethod.GET)	
	public ModelAndView calc()
	{
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("calc");
		
		return mv;
	}
	
	
	
	

}
