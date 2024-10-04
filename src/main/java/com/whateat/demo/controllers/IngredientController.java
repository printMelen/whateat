package com.whateat.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.whateat.demo.model.Ingredient;
import com.whateat.demo.servicesImpl.IngredientServicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@AllArgsConstructor
@RequestMapping("/ingredient")
public class IngredientController {

    private final IngredientServicesImpl ingredientServicesImpl;

    @GetMapping
    public List<Ingredient> getIngredients() {
        return ingredientServicesImpl.getIngredients();
    }

    @PostMapping("/create")
    public void createIngredient(@RequestBody Ingredient ingredient) {
        ingredientServicesImpl.createIngredient(ingredient);
    }
    
}
