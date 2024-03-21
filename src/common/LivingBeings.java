package common;

public abstract class LivingBeings {
    private String name;
    private int age;
    private double height;

    // Getter anb setter for atributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    // Common methods for all living beings
    public abstract void born();

    public abstract void grow();

    public abstract void reproduce();

    public abstract void die();

    public abstract void communicate();

}
