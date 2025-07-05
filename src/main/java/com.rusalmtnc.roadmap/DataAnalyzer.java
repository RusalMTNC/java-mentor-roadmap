package com.rusalmtnc.roadmap;
/*Первый элемент "85" — это вес пользователя (int).
Второй элемент "true" — это статус "активен" (boolean).
Третий элемент "45.9" — это результат теста (double).
Четвертый элемент "admin" — это роль. Мы пока не можем ее обработать, поэтому проверь, является ли первый символ этого слова буквой, и выведи результат проверки (true/false).
Пятый элемент "120" — это количество очков. Сохрани его в переменную типа Integer (именно объект-обертку).*/
public class DataAnalyzer {
    public static void main(String[] args) {
        String[] rawData = {"85", "true", "45.9", "admin", "120"};
        int weight = Integer.parseInt(rawData[0]);
        boolean status = Boolean.parseBoolean(rawData[1]);
        double result = Double.parseDouble(rawData[2]);
        boolean resultLetter = Character.isLetter(rawData[3].charAt(0));
        Integer point = Integer.parseInt(rawData[4]);
        /*--- Анализ данных ---
Вес: 85
Активен: true
Результат теста: 45.9
Первый символ роли - буква: true
Очки (из объекта Integer): 120*/
        System.out.println("--- Анализ данных ---");
        System.out.println("Вес: " + weight);
        System.out.println("Активен: " + status);
        System.out.println("Результат Теста: " + result);
        System.out.println("Первый символ роли - буква: " + resultLetter);
        System.out.println("Очки (из объекта Integer): " + point);
        int bonus = 10;

        System.out.println("Очки (из объекта Integer) + бонус: " + (point+bonus));
    }
}
