package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.repository.UserRepository;

@Controller
@RequestMapping("/20km")
public class SearchController {
	
	@Autowired
	private UserRepository repositry;
	
	@RequestMapping("")
	private String index() {
		return "user-info-search";
	}
	
	@RequestMapping("/receive")
	private String receiveUserInfo(int id, Model model) {
		User user = repositry.load(id);
		model.addAttribute("user", user);
		return "user-info-view";
	}

}
