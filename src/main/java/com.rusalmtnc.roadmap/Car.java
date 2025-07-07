package com.rusalmtnc.roadmap;

public class Car {
String brand;
String model;
int yearOfManufacture;
    void startEngine() {
        System.out.println(brand + " " + model + " запустила двигатель.");
    }
    void displayInfo(){
        System.out.println("Марка машины: " + brand);
        System.out.println("Модель машины: " + model);
        System.out.println("Год выпуска машины: " + yearOfManufacture);
    }

    public static void main(String[] args) {
        Car russian = new Car();
        russian.brand = "Lada";
        russian.model = "Granta";
        russian.yearOfManufacture = 2020;

        russian.displayInfo();
        russian.startEngine();

        Car german = new Car();
        german.brand = "BMW";
        german.model = "X5";
        german.yearOfManufacture = 2022;

        german.displayInfo();
        german.startEngine();
    }
}
