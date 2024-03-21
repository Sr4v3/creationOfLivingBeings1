package SkyBeings;

import BeingsOfTheEarth.EarthBeing;
import common.LivingBeings;

public class Angel extends LivingBeings implements EarthBeing, SkyBeing {

    @Override
    public void respawn() {
        System.out.println("Angel is respawning.");
    }

    @Override
    public void walk() {
        System.out.println("Angel is walking through water and sky.");
    }

    @Override
    public void crawl() {
        System.out.println("Angel is crawling.");
    }

    @Override
    public void fly() {
        System.out.println("Angel is flying with his wings.");
    }

    @Override
    public void changeDimension() {
        System.out.println("Angel change dimension");
    }

    @Override
    public void navigate() {

    }

    @Override
    public void born() {
        System.out.println("God create a new angel. An Angel was born.");
    }

    @Override
    public void grow() {
        System.out.println("Angel is growing.");
    }

    @Override
    public void reproduce() {
        System.out.println("Angel down to the earth and reproduces.");
    }

    @Override
    public void die() {
        System.out.println("Angel dies.");
    }

    @Override
    public void communicate() {
        System.out.println("Angel communicates.");
    }

    @Override
    public String toString() {
        return "The Angel: " + getName() + ", is: " + getAge() + " years old, height=" + getHeight();
    }
}