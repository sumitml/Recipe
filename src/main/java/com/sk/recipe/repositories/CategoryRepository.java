package com.sk.recipe.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sk.recipe.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	
	Optional<Category> findByDecription(String decription);

}
