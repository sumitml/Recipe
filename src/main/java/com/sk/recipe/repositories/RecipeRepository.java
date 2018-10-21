package com.sk.recipe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sk.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
