package com.android.web;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	
	@RequestMapping(value="welcome.htm")
	public ModelAndView welcome(HttpServletResponse response){
		
		 ModelAndView mav=new ModelAndView("welcome");
		 
		 return mav;
		
	}
	
	
}
