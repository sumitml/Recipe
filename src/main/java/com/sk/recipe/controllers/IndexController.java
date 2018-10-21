package com.sk.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping({"","/","/Index"})
	public String getIndexPage() {
		return "Index";
	}

}
