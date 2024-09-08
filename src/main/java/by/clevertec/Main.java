package by.clevertec;

import by.clevertec.model.Animal;
import by.clevertec.model.Car;
import by.clevertec.model.Examination;
import by.clevertec.model.Flower;
import by.clevertec.model.House;
import by.clevertec.model.Person;
import by.clevertec.model.Student;
import by.clevertec.util.Util;

import java.util.Comparator;
import java.util.List;
import java.time.LocalDate;
import java.util.Date;
import java.time.Period;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
        task22();
    }

    public static void task1() {
        List<Animal> animals = Util.getAnimals();
        animals.stream()
                .filter(animal -> animal.getAge() > 10 && animal.getAge() < 20)
                .sorted(Comparator.comparingInt(Animal::getAge))
                .skip(7*2)
                .limit(7)
                .forEach(System.out::println);
    }

    public static void task2() {
        List<Animal> animals = Util.getAnimals();
        animals.stream()
                .filter(animal -> animal.getOrigin().equals("Japanese"))
                .peek(animal -> animal.setBread(animal.getBread().toUpperCase()))
                .forEach(System.out::println);
    }

    public static void task3() {
        List<Animal> animals = Util.getAnimals();
        animals.stream()
                .filter(animal -> animal.getAge() > 30)
                .map(Animal::getOrigin)
                .filter(origin -> origin.startsWith("A"))
                .distinct()
                .forEach(System.out::println);
    }

    public static void task4() {
        List<Animal> animals = Util.getAnimals();
        long female = animals.stream()
                .filter(animal -> animal.getGender().equals("Female"))
                .count();
        System.out.println(female);
    }

    public static void task5() {
        List<Animal> animals = Util.getAnimals();
        long hungarians = animals.stream()
                .filter(animal -> 20 <= animal.getAge() && animal.getAge() <= 30)
                .filter(animal -> animal.getOrigin().equals("Hungarian"))
                .count();
        System.out.println(hungarians > 0);
    }

    public static void task6() {
        List<Animal> animals = Util.getAnimals();
        long counted = animals.stream()
                .filter(animal -> !Objects.equals(animal.getGender(), "Male")
                        && !animal.getGender().equals("Female"))
                .count();
        System.out.println(counted == 0);
    }

    public static void task7() {
        List<Animal> animals = Util.getAnimals();
        long oceania = animals.stream()
                .filter(animal -> animal.getOrigin().equals("Oceania"))
                .count();
        System.out.println(oceania == 0);
    }

    public static void task8() {
        List<Animal> animals = Util.getAnimals();
        Integer age = animals.stream()
                .sorted((Comparator.comparing(Animal::getBread)))
                .mapToInt(Animal::getAge)
                .limit(100)
                .max()
                .getAsInt();
        System.out.println(age);
    }

    public static void task9() {
        List<Animal> animals = Util.getAnimals();
        animals.stream()
                .map(Animal::getBread)
                .map(String::toCharArray)
                .mapToInt(chars -> chars.length)
                .reduce(Integer::min)
                .ifPresent(System.out::println);
    }

    public static void task10() {
        List<Animal> animals = Util.getAnimals();
        animals.stream()
                .map(Animal::getAge)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }

    public static void task11() {
        List<Animal> animals = Util.getAnimals();
        double average = animals.stream()
                .filter(animal -> animal.getOrigin().equals("Indonesian"))
                .mapToInt(Animal::getAge)
                .average()
                .getAsDouble();
        System.out.println(average);
    }

    public static void task12() {
        List<Person> persons = Util.getPersons();
        persons.stream()
                .filter(person -> person.getGender().equals("Male"))
                .filter(person -> {
                    int age = Period.between(person.getDateOfBirth(), LocalDate.now()).getYears();
                    return age >= 18 && age <= 27;
                })
                .sorted(Comparator.comparing(Person::getRecruitmentGroup))
                .limit(200)
                .forEach(System.out::println);
    }

    public static void task13() {
        List<House> houses = Util.getHouses();
//        houses.stream() Продолжить ...
    }

    public static void task14() {
        List<Car> cars = Util.getCars();
//        cars.stream() Продолжить ...
    }

    public static void task15() {
        List<Flower> flowers = Util.getFlowers();
//        flowers.stream() Продолжить ...
    }

    public static void task16() {
        List<Student> students = Util.getStudents();
        students.stream()
                .filter(student -> student.getAge() < 18)
                .sorted(Comparator.comparing(Student::getSurname))
                .forEach(System.out::println);
    }

    public static void task17() {
        List<Student> students = Util.getStudents();
        students.stream()
                .map(Student::getGroup)
                .distinct()
                .forEach(System.out::println);
    }

    public static void task18() {
        List<Student> students = Util.getStudents();
        List<Examination> examinations = Util.getExaminations();
//        students.stream() Продолжить ...
    }

    public static void task19() {
        List<Student> students = Util.getStudents();
//        students.stream() Продолжить ...
    }

    public static void task20() {
        List<Student> students = Util.getStudents();
//        students.stream() Продолжить ...
    }

    public static void task21() {
        List<Student> students = Util.getStudents();
//        students.stream() Продолжить ...
    }

    public static void task22() {
        List<Student> students = Util.getStudents();
//        students.stream() Продолжить ...
    }
}
