package com.livetechstudy.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {

	@GetMapping("/hello")
	public ModelAndView helloWorld() {
 
		String message = "Message From Hello World";
		return new ModelAndView("helloworld", "message", message);
	}
	
	@GetMapping("/")
	public String welcomePage() {
		return "welcome";
	}
}
