package com.sk.recipe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sk.recipe.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
