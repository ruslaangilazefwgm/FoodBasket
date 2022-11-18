package com.skypro.foodbasketspring.service;

import com.skypro.foodbasketspring.model.Food;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FoodService {
    private final Food food;

    public FoodService(Food food) {
        this.food = food;
    }

    public void addToFood(List<Integer> idsToAdd) {
        food.addToFood(idsToAdd);
    }

    public List<Integer> getFood() {
        return food.getFoodContent();
    }
}
