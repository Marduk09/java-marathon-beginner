package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Item;

@Controller
@RequestMapping("/25km")
public class ShoppingController {
	
	@Autowired
	private HttpSession session;
	@Autowired
	private ServletContext applicaton;
	
	@RequestMapping("")
	public String index(Model model) {
		List<Item> cartList = new ArrayList<>();
		session.setAttribute("cartList", cartList);
		
		List<Item> itemList = new ArrayList<>();
		itemList.add(new Item("手帳ノート", 1000));
		itemList.add(new Item("文房具セット", 1500));
		itemList.add(new Item("ファイル", 2000));
		applicaton.setAttribute("itemList", itemList);
		
		model.addAttribute("total", 0);
		
		return "itemAndCart";
	}

}
