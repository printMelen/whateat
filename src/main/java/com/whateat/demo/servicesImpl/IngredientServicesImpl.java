package com.whateat.demo.servicesImpl;

import org.springframework.stereotype.Service;

import com.whateat.demo.model.Ingredient;
import com.whateat.demo.repository.IngredientRepository;
import com.whateat.demo.services.IngredientServices;
import java.util.List;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class IngredientServicesImpl implements IngredientServices {
    private final IngredientRepository ingredientRepository;

    @Override
    public void createIngredient(Ingredient ingredient) {
        ingredientRepository.save(ingredient);
    }

    @Override
    public List<Ingredient> getIngredients() {
        return ingredientRepository.findAll();
    }


}
