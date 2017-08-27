package com.montivero.poc.domain;

import com.montivero.poc.annotation.*;

@AnimalDescription(
        animalGroup = AnimalGroup.VERTEBRATE,
        characteristics = "A nice bird",
        foodGroup = FoodGroup.HERBIVOROUS,
        reproductionGroup = ReproductionGroup.OVIPAROUS,
        habitatGroup = HabitatGroup.WILD,
        walkingGroup = WalkingGroup.WALK_TWO_PAWS,
        curiosities = "This animal loves watermelons")
public class Dodo implements WildAnimal{

    @Override
    public String doSound() {
        return "...";
    }

    @Override
    public boolean isExtinct() {
        return true;
    }
}
