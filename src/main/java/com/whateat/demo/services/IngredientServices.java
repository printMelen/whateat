package com.whateat.demo.services;

import com.whateat.demo.model.Ingredient;
import java.util.List;

public interface IngredientServices {
    public void createIngredient(Ingredient ingredient);
    public List<Ingredient> getIngredients();
}
