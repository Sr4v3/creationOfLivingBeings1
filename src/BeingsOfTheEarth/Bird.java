package BeingsOfTheEarth;

import SkyBeings.SkyBeing;
import common.LivingBeings;

public class Bird extends LivingBeings implements EarthBeing, SkyBeing {

    //LivingBeings methods
    @Override
    public void born() {
        System.out.println("A bird is born.");
    }

    @Override
    public void grow() {
        System.out.println("A bird grows.");
    }

    @Override
    public void reproduce() {
        System.out.println("A bird reproduces.");
    }

    @Override
    public void die() {
        System.out.println("A bird dies.");
    }

    @Override
    public void communicate() {
        System.out.println("A bird communicates.");
    }

    //EarthBeing methods
    @Override
    public void walk() {
        System.out.println("A bird walks in two legs.");
    }

    @Override
    public void crawl() {
        System.out.println("A bird is crawling, ");
    }

    @Override
    public void respawn() {
        System.out.println("A bird is being resurrected.");
    }


    //SkyBeing methods
    @Override
    public void fly() {
        System.out.println("A bird flies.");
    }

    @Override
    public void changeDimension() {
        System.out.println("A bird die. Is going to the heaven, a new dimension.");
    }

    @Override
    public void navigate() {
        System.out.println("A bird is navigating with other birds.");
    }

    @Override
    public String toString() {
        return "The bird " + getName() + ", is: " + getAge() + " years old, height=" + getHeight();}

}