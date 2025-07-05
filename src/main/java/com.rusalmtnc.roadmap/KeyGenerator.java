package com.rusalmtnc.roadmap;

public class KeyGenerator {
    public static void main(String[] args) {
        String username = "ruslan";
        String step1Result = username.toUpperCase();
        System.out.println("Исходное имя после шага 1: " + username);
        System.out.println("Шаг 1 (в верхний регистр): " + step1Result);
        String step2Result = "KEY-" + step1Result;
        System.out.println("Исходное имя после шага 2: " + username);
        System.out.println("Шаг 2 (добавлен префикс): " + step2Result);
        String finalKey = step2Result + "-2024";
        System.out.println("Исходное имя после шага 3: " + username);
        System.out.println("Шаг 3 (финальный ключ): " + finalKey);
    }
}
