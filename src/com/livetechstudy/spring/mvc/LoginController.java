package com.livetechstudy.spring.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
    @Autowired
	LoginService service;
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	@PostMapping("/validate")
	public String validate(@RequestParam String name,@RequestParam String password,ModelMap model) {
		
		if(service.isValid(name, password)) {
			model.put("name", name);
			return "showdetails";
		}else {
			return "login";
		}
	}
}
