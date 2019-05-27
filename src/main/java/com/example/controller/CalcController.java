package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/10km")
public class CalcController {
	
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "input-value";
	}
	
	@RequestMapping("/receive")
	public String calcReceive(Integer num1, Integer num2) {
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("result", num1*num2);
		return "output-value";
	}
	
	@RequestMapping("/to-value2")
	public String toValue2() {
		return "output-value2";
	}

}
