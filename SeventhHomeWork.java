/**
 * Java 1. Homework # 7
 *
 * @author Aleksandr Melekhin
 * @version 15.01.2022
 */

class SeventhHomeWork {

    public static void main(String[] args) {
        Cat[] cat = new Cat[4];
        cat[0] = new Cat("First Cat", 10);
        cat[1] = new Cat("Second Cat", 15);
        cat[2] = new Cat("Third Cat", 10);
        cat[3] = new Cat("Fourth Cat", 15);

        Plate plate = new Plate(20);

        for (Cat cat1 : cat) {

            cat1.eat(plate);
            System.out.println(cat1);
            plate.increaseFood(cat1);
        }
        System.out.println("CatFood added");

        for (Cat cat1 : cat) {
            cat1.eat(plate);
            System.out.println(cat1);
            plate.increaseFood(cat1);
        }

    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean full;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    int getAppetite() {
        return this.appetite;
    }

    boolean getFull() {
        return this.full;
    }

    boolean eat(Plate plate) {
        if (this.full) {
            System.out.println(this.name + " is full");
            return this.full;
        } else {
            this.full = plate.decreaseFood(appetite);
            System.out.println(this.name + " is hungry");
            return this.full;
        }
    }

    @Override
    public String toString() {
        return "Cat: " + name + ". Appetite: " + appetite;
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    int getFood () {
        return food;
    }

    void setFood(int food) {
        this.food = food;
    }

    void increaseFood(Cat cat) {
        if (cat.getFull() == false) {
            this.food += 30;
        }
    }

    boolean decreaseFood(int food) {
        if (this.food - food < 0) {
            return false;
        } else {
            this.food = this.food - food;
            return true;
        }
    }

    @Override
    public String toString() {
        return "CatFood: " + food;
    }
}