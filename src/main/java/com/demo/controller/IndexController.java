package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexController {

	
	@RequestMapping("/")
	public String hello(Model model) {
		model.addAttribute("name", "张三");
		return "helloresult";
	}
	
	
}
