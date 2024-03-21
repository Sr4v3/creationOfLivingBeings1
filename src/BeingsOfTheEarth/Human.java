package BeingsOfTheEarth;

import BeingsOfTheEarth.EarthBeing;
import SkyBeings.SkyBeing;
import common.LivingBeings;


public class Human extends LivingBeings implements EarthBeing, SkyBeing {

    //LivingBeings methods
    @Override
    public void born() {
        System.out.println("A human is born.");
    }

    @Override
    public void grow() {
        System.out.println("A human grows.");
    }

    @Override
    public void reproduce() {
        System.out.println("A human reproduces.");
    }

    @Override
    public void die() {
        System.out.println("A human dies.");
    }

    @Override
    public void communicate()  {
        System.out.println("A human talks to communicate.");
    }

    //EarthBeing methods
    @Override
    public void walk() {
        System.out.println("A human walks in two legs.");
    }

    @Override
    public void respawn() {
        System.out.println("A human respawn. Reincarnation?");
    }

    @Override
    public void crawl() {
        System.out.println("A human is crawling");
    }


    //SkyBeing methods
    @Override
    public void fly() {
        System.out.println("A human flies in a plane... The plane falls out...");
    }

    @Override
    public void changeDimension() {
        System.out.println("A human changes dimension, is going to the hell... Human dies.");
    }

    @Override
    public void navigate() {
        System.out.println("A human is navigating on a aerostatic balloon.");
    }

    @Override
    public String toString() {
        return "The human: "+ getName() + ", is: " + getAge() + " years old, height=" + getHeight();
    }
}
