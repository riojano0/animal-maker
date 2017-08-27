package com.montivero.poc.domain;

import com.montivero.poc.annotation.*;

@AnimalDescription(
        animalGroup = AnimalGroup.VERTEBRATE,
        characteristics = "Has a long neck",
        foodGroup = FoodGroup.HERBIVOROUS,
        reproductionGroup = ReproductionGroup.OVIPAROUS,
        habitatGroup = HabitatGroup.WILD,
        walkingGroup = WalkingGroup.WALK_TWO_PAWS,
        curiosities = "She has no vocal cords, is molt")
public class Giraffe implements WildAnimal {


    @Override
    public String doSound() {
        return "None";
    }

    @Override
    public boolean isExtinct() {
        return false;
    }
}
