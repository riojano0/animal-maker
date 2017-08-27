package com.montivero.poc.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AnimalDescription {

    AnimalGroup animalGroup();

    String[] characteristics();

    FoodGroup foodGroup();

    ReproductionGroup reproductionGroup();

    HabitatGroup habitatGroup();

    WalkingGroup walkingGroup();

    String[] curiosities();

}
