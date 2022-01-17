/**
 * Java 1. Homework # 6
 *
 * @author Aleksandr Melekhin
 * @version 13.01.2022
 */

class SixthHomeWork {

    public static void main(String[] args) {
        Cat cat = new Cat("Cat Boris",200, 0);
        Cat cat1 = new Cat("Cat1",300, 0);
        Dog dog = new Dog("Dog Zabivaka", 500, 10);
        Dog dog1 = new Dog("Dog1", 300, 20);

        IAnimal[] animals = {cat, cat1, dog, dog1};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(200));
            System.out.println(animal.run(500));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(20));
        }
    }
}

class Dog extends Animals {
    Dog(String name, int canRun, int canSwim) {
        super(name, canRun, canSwim);
    }
}

class Cat extends Animals {
    Cat(String name, int canRun, int canSwim) {
        super(name, canRun, canSwim);
    }

    Cat(String name, int canRun) {
        super(name, canRun, 0);
    }

    @Override
    public String swim(int distance) {
        return "Cats can't swim";
    }
}

abstract class Animals implements IAnimal {
    private int canRun;
    private int canSwim;
    private String name;

    Animals(String name, int canRun, int canSwim) {
        this.name = name;
        this.canRun = canRun;
        this.canSwim = canSwim;
    }

    @Override
    public String toString() {
        return "Name: " + name + " can run: " + canRun + " & can swim: " + canSwim;
    }
    
    @Override
    public String run(int distance) {
        if (distance > canRun) {
            return "- " + name + " couldn't run " + distance;
        } else {
            return "+ " + name + " successfully ran " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > canSwim) {
            return "- " + name + " couldn't swim " + distance;
        } else {
            return "+ " + name + " successfully swim " + distance;
        }
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}