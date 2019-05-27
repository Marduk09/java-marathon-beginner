package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.form.UserForm;


@Controller
@RequestMapping("/5km")
public class UserInfoController {
	
	@ModelAttribute
	public UserForm setUpUser() {
		return new UserForm();
	}

	@RequestMapping("")
	public String index() {
		return "input-user-info";
	}
	
	@RequestMapping("/receive")
	public String receiveUser(UserForm userForm, Model model) {
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		model.addAttribute("user", user);
		return "output-user-info"; 
		
	}
	
	
}
