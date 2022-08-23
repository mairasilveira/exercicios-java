package entities;

public class Persons {
    private String name;
    private int age;
    private double height;

    public Persons(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + "Idade: " + age + "Altura: " + height;
    }
}
