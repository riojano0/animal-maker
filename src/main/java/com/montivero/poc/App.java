package com.montivero.poc;


import com.montivero.poc.annotation.AnimalDescription;
import com.montivero.poc.domain.*;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        DomesticAnimal cowDora = new Cow("Dora", "The Lacteo");
        System.out.println("The cow name: " + cowDora.getName());
        System.out.println("The cow owner: " + cowDora.getOwner());
        System.out.println("The cow sound: " + cowDora.doSound());
        animalDescription(cowDora);

        DomesticAnimal catRulito = new Cat("Rulito", "The hairy People");
        System.out.println("The cat name: " + cowDora.getName());
        System.out.println("The cat owner: " + cowDora.getOwner());
        System.out.println("The cat sound: " + cowDora.doSound());
        animalDescription(catRulito);

        WildAnimal dodo = new Dodo();
        System.out.println("The dodo is extinct: " + dodo.isExtinct());
        System.out.println("The dodo sound: " + dodo.doSound());
        animalDescription(dodo);

        WildAnimal giraffe = new Giraffe();
        System.out.println("The giraffe is extinct: " + giraffe.isExtinct());
        System.out.println("The giraffe sound: " + giraffe.doSound());
        animalDescription(giraffe);

    }

    private static void animalDescription(Animal animal) {
        AnimalDescription animalDescription = animal.getClass().getAnnotation(AnimalDescription.class);
        System.out.println("AnimalDescription Group " + animalDescription.animalGroup());
        System.out.println("characteristics Group " + Arrays.toString(animalDescription.characteristics()));
        System.out.println("Food Group " + animalDescription.foodGroup());
        System.out.println("Habitat Group " + animalDescription.habitatGroup());
        System.out.println("Reproduction Group " + animalDescription.reproductionGroup());
        System.out.println("Walking Group " + animalDescription.walkingGroup());
        System.out.println("Curiosities" + Arrays.toString(animalDescription.curiosities()));
        System.out.println("\n----------------\n");
    }
}
