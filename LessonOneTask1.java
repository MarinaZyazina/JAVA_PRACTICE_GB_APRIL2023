/*Задание №1
Написать программу, которая запросит пользователя ввести
<Имя> в консоли.
Получить введенную строку и выведет в консоль сообщение
“Привет, <Имя>!”*/

import java.util.Scanner;
public class LessonOneTask1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите Ваше имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!%n", name);
        iScanner.close();
    }
}
