package com.livetechstudy.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionExampleController {

	@GetMapping("/sessionexample")
	public String random() {
		return "sessionexample";
	}
}
