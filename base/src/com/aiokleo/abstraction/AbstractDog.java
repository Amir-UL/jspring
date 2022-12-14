package com.aiokleo.abstraction;

import com.aiokleo.annotation.custom_annotation.RunImmediately;
import com.aiokleo.annotation.custom_annotation.VeryImportant;

@VeryImportant
public class AbstractDog extends Animals{

//    Abstract method overriding
    @Override
    @RunImmediately(runTimes = 2)
    public void abstractMethod() {
        System.out.println("I love " + this.ILove + " also came from Animal.java(which is a abstract class)");
        System.out.println("Say Vau..Vau...!");

    }
//    Calling non-Abstract Method
    @Override
    public void EveryThing(){ // this method came from Human Interface
        System.out.println("\n"+"Yes!");
        System.out.println("I hate " + this.IHate + " also the method EveryThing is an Interface comes from Human Interface");
    }

}
