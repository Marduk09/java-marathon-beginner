package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/15km")
public class RegisterController {
	
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "buy-goods";
	}
	
	@RequestMapping("/receive")
	public String calcSum(int goods1, int goods2, int goods3) {
		int price = goods1 + goods2 + goods3;
		int priceInculeTax = (int) (price*1.08);
		
		application.setAttribute("price", price);
		application.setAttribute("priceIncludeTax", priceInculeTax);
		
		return "total-price";
	}

}
