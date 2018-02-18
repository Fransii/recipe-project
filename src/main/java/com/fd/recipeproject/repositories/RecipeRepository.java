package com.fd.recipeproject.repositories;

import com.fd.recipeproject.models.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    Set<Recipe> findAllByOrderByIdAsc();
}
