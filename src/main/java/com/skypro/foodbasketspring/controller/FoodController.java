package com.skypro.foodbasketspring.controller;

import com.skypro.foodbasketspring.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class FoodController {
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/add")
    public void addItems(@RequestParam("id") List<Integer> idsToAdd) {
        this.foodService.addToFood(idsToAdd);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return this.foodService.getFood();
    }

}
