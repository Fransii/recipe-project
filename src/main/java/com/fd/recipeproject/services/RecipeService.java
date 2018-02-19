package com.fd.recipeproject.services;

import com.fd.recipeproject.commands.RecipeCommand;
import com.fd.recipeproject.models.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long id);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
