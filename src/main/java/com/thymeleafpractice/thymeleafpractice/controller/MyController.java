package com.thymeleafpractice.thymeleafpractice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value="/about", method = RequestMethod.GET)
	public String about(Model model)
	{
		model.addAttribute("name","Motahharul haque");
		model.addAttribute("currentDate", new Date());
		return "about";
	}
	
	@GetMapping("/loop")
	public String iterateHandler(Model model)
	{
		List<String> list = List.of("Apple","Banana","Cherry","Diamond","Egg","Fig","Grapes");
		model.addAttribute("list",list);
		return "iterate";
	}
}
