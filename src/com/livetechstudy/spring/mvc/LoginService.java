package com.livetechstudy.spring.mvc;

public class LoginService {

	public boolean isValid(String name, String password) {
		if (name.equals("abc") && password.equals(password)) {
			return true;
		} else {
			return false;
		}
	}
}
