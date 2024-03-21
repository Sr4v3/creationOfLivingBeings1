import BeingsOfTheEarth.Animal;
import BeingsOfTheEarth.Human;
import SkyBeings.Angel;
import BeingsOfTheEarth.Bird;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Select an option:");
            System.out.println("1. Create Animal");
            System.out.println("2. Create Human");
            System.out.println("3. Create Bird");
            System.out.println("4. Create Angel");
            System.out.println("5. Exit");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createAnimal(scanner);
                    break;
                case "2":
                    createHuman(scanner);
                    break;
                case "3":
                    createBird(scanner);
                    break;
                case "4":
                    createAngel(scanner);
                    break;
                case "5":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (!choice.equals("4"));
    }

    private static void createAnimal(Scanner scanner) {
        System.out.println("Creating Animal...");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter height: ");
        double height = Double.parseDouble(scanner.nextLine());

        // Create Animal object and set attributes
        Animal animal = new Animal();
        animal.setName(name);
        animal.setAge(age);
        animal.setHeight(height);

        System.out.println("Animal created: " + animal);
        animal.born();
        animal.grow();
        animal.walk();
        animal.communicate();
        animal.reproduce();
        animal.crawl();
        animal.die();
        animal.respawn();



    }

    private static void createHuman(Scanner scanner) {
        System.out.println("Creating Human...");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter height: ");
        double height = Double.parseDouble(scanner.nextLine());

        // Create Human object and set attributes
        Human human = new Human();
        human.setName(name);
        human.setAge(age);
        human.setHeight(height);

        System.out.println("Human created: " + human);
        human.born();
        human.grow();
        human.walk();
        human.communicate();
        human.reproduce();
        human.fly();
        human.crawl();
        human.die();
        human.changeDimension();
    }

    private static void createBird(Scanner scanner) {
        System.out.println("Creating Bird...");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter height: ");
        double height = Double.parseDouble(scanner.nextLine());

        // Create Bird object and set attributes
        Bird bird = new Bird();
        bird.setName(name);
        bird.setAge(age);
        bird.setHeight(height);

        System.out.println("Bird created: " + bird);
        bird.born();
        bird.grow();
        bird.fly();
        bird.navigate();
        bird.communicate();
        bird.reproduce();
        bird.die();
        bird.respawn();
        bird.walk();
        bird.crawl();
        bird.changeDimension();

    }

    private static void createAngel(Scanner scanner) {
        System.out.println("Creating Angel...");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter height: ");
        double height = Double.parseDouble(scanner.nextLine());

        // Create Bird object and set attributes
        Angel angel = new Angel();
        angel.setName(name);
        angel.setAge(age);
        angel.setHeight(height);

        System.out.println("Angel created: " + angel);
        angel.born();
        angel.grow();
        angel.communicate();
        angel.reproduce();
        angel.fly();
        angel.changeDimension();
        angel.navigate();
        angel.walk();
        angel.die();
        angel.crawl();
        angel.respawn();

    }
}
