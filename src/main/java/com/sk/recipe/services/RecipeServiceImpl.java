package com.sk.recipe.services;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.sk.recipe.domain.Recipe;
import com.sk.recipe.repositories.RecipeRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

	private final RecipeRepository recipeRepository;
	
	
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;
	}


	@Override
	public Set<Recipe> getRecipe() {
		log.debug("i m in servie");
		Set<Recipe> recipeSet = new HashSet<>();
		recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
		return recipeSet;
	}

}
