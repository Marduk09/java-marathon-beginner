package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("1km")
public class NameReceiveController {
	
	@RequestMapping("")
	public String index() {
		return "inputname";
	}
	
	@RequestMapping("receive")
	public String nameReceive(String name, Model model) {
		model.addAttribute("name", name);
		return "outputname";
	}
}
