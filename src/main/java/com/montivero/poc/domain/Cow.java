package com.montivero.poc.domain;

import com.montivero.poc.annotation.*;

@AnimalDescription(
        animalGroup = AnimalGroup.VERTEBRATE,
        characteristics = "Fat and calm",
        foodGroup = FoodGroup.HERBIVOROUS,
        reproductionGroup = ReproductionGroup.VIVIPAROUS,
        habitatGroup = HabitatGroup.MULTIPLE,
        walkingGroup = WalkingGroup.WALK_FOUR_PAWS,
        curiosities = "Say Muu")
public class Cow implements DomesticAnimal {

    private String name;
    private String owner;

    public Cow(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String doSound() {
        return "Muuu";
    }

    @Override
    public String getOwner() {
        return owner;
    }
}
