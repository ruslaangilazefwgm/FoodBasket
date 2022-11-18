package com.skypro.foodbasketspring.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Food {
    private final List<Integer> userFood = new ArrayList<>();

    public void addToFood(List<Integer> idsToAdd) {
        userFood.addAll(idsToAdd);
    }

    public List<Integer> getFoodContent() {
        return Collections.unmodifiableList(userFood);
    }
}
