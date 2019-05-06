package com.livetechstudy.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@GetMapping("/hello")
	public ModelAndView helloWorld() {
		String message = "Message From Hello World";
		ModelAndView mv = new ModelAndView("helloworld", "message", message);
		return mv;
	}
	
	
	@GetMapping("/")
	public String welcomePage() {
		return "welcome";
	}
}
