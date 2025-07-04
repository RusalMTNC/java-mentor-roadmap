package com.rusalmtnc.roadmap;
//Уровень персонажа (например, 80).
//Количество очков здоровья (например, 5000).
//Стоимость зелья маны (например, 12.5).
//Первая буква имени персонажа (например, 'K').
//Является ли персонаж членом гильдии (true или false).
//После этого выведи все эти значения в консоль в удобочитаемом формате, например:
//        "--- Профиль персонажа ---"
//        "Уровень: 80"
//        "Здоровье: 5000"
//        ...и так далее.
public class CharacterProfile {
    public static void main(String[] args) {
        int level = 80;
        int hpPoint = 5000;
        double price = 15.5;
        char firstLetter = 'К';
        boolean guildMember = true;
        System.out.println("--- Профиль персонажа ---");
        System.out.println("Уровень персонажа: " + level);
        System.out.println("Количество очков здоровья: " + hpPoint);
        System.out.println("Стоимость зелья маны: " + price);
        System.out.println("Первая буква имени персонажа: " + firstLetter);
        System.out.println("Является ли персонаж членом гильдии: " + guildMember);
    }
}
