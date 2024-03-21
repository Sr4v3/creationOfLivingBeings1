package BeingsOfTheEarth;

import common.LivingBeings;

public class Animal extends LivingBeings implements EarthBeing {
    //LivingBeings methods
    @Override
    public void born() {
        System.out.println("An animal is born.");
    }

    @Override
    public void grow() {
        System.out.println("An animal grows.");
    }

    @Override
    public void reproduce() {
        System.out.println("An animal reproduces.");
    }

    @Override
    public void die() {
        System.out.println("An animal dies.");
    }

    @Override
    public void communicate() {
        System.out.println("An animal make noises for communicates.");
    }

    //EarthBeing methods
    @Override
    public void walk() {
        System.out.println("An animal walks on four legs");
    }
    @Override
    public void respawn() {
        System.out.println("An animal don't respawn");
    }

    @Override
    public void crawl() {
        System.out.println("An animal is crawling.");
    }

    @Override
    public String toString() {
        return "The animal: "+ getName() + ", is: " + getAge() + " years old, height=" + getHeight();
    }
}
