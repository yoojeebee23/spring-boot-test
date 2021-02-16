package com.yogiyo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {
	
	// 인터셉터가 등록
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	// 인터셉터가 비등록
	@RequestMapping("/home2")
	public String home2() {
		return "home2";
	}

}
