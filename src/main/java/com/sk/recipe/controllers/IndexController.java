package com.sk.recipe.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sk.recipe.domain.Category;
import com.sk.recipe.domain.UnitOfMeasure;
import com.sk.recipe.repositories.CategoryRepository;
import com.sk.recipe.repositories.UnitOfMeasureRepository;
import com.sk.recipe.services.RecipeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {
	
	private final RecipeService recipeService;
	
	
	public IndexController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}


	@RequestMapping({"","/","/Index"})
	public String getIndexPage(Model model) {
		log.debug("Getting Index Page");
		model.addAttribute("recipes",recipeService.getRecipe());
		return "Index";
	}

}
