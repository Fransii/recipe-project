package com.fd.recipeproject.services;

import com.fd.recipeproject.models.Recipe;

import java.util.Set;

public interface RecipseService {
    Set<Recipe> getRecipes();
}
