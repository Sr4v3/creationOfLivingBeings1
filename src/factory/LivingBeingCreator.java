package factory;

import BeingsOfTheEarth.Animal;
import BeingsOfTheEarth.Human;
import SkyBeings.Bird;
import common.Creator;
import common.LivingBeings;

public class LivingBeingCreator implements Creator {
    @Override
    public LivingBeings createLivingBeings(String type) {
        switch (type) {
            case "Human":
                return new Human();
            case "Animal":
                return new Animal();
            case "Bird":
                return new Bird();
            default:
                throw new IllegalArgumentException("Invalid type: " + type);
        }
    }
}

