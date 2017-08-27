package com.montivero.poc.domain;

import com.montivero.poc.annotation.*;

@AnimalDescription(
        animalGroup = AnimalGroup.VERTEBRATE,
        characteristics = "Is the evil incarnated",
        foodGroup = FoodGroup.CARNIVOROUS,
        reproductionGroup = ReproductionGroup.VIVIPAROUS,
        habitatGroup = HabitatGroup.MULTIPLE,
        walkingGroup = WalkingGroup.WALK_FOUR_PAWS,
        curiosities = "The are the owners of internet")
public class Cat implements DomesticAnimal {

    private String name;
    private String owner;

    public Cat(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String doSound() {
        return "Miau....otro gato";
    }

    @Override
    public String getOwner() {
        return owner;
    }
}
