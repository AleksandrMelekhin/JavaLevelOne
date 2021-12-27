/**
 * Java 1. Homework # 5
 *
 * @author Aleksandr Melekhin
 * @version 27.12.2021
 */

class FifthHomeWork {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan Ivanovich", "Director", "ivanov@test.ru", "89999999999", 100_000, 49);
        persArray[1] = new Person("Petrov Petr Petrovich", "Developer", "petrov@test.ru", "89169999999", 90_000, 39);
        persArray[2] = new Person("Vasiliev Vasiliy Vasilievich", "Designer", "vasiliev@test.ru", "89039999999", 50_000, 41);
        persArray[3] = new Person("Gerasimov Andrey Andreevich", "HR", "gerasimov@test.ru", "89259999999", 45_000, 40);
        persArray[4] = new Person("Dubnikov Vladimir Vladimirovich", "QA Engineer", "dubnikov@test.ru", "89159999999",40_000, 55);
        for (Person person : persArray)
            if (person.knowAge()>40)
                System.out.println(person);
    }
}

class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    int knowAge() {
        return age;
    }

    public String toString(){
        return("FIO: " + name + " Position: " + position + " Email: " + email + " Phone: " + phone + " Salary: $" + salary + " Age: " + age);
    }
}