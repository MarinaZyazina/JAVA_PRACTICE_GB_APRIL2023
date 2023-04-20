/*В консоли запросить имя пользователя. 
В зависимости от текущего времени, вывести приветствие вида:
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59.*/

import java.time.LocalTime; 
import java.util.Scanner;

public class HomeworkOneTask4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите Ваше имя: ");       
        String name = iScanner.nextLine();
        LocalTime time = LocalTime.now();        
        String greeting;       
        if (time.isAfter(LocalTime.of(5, 00)) && time.isBefore(LocalTime.of(11, 59))) { 
            greeting = "Доброе утро, ";       
        } else if (time.isAfter(LocalTime.of(12, 00)) && time.isBefore(LocalTime.of(17, 59))) {
            greeting = "Добрый день, ";       
        } else if (time.isAfter(LocalTime.of(18, 00)) && time.isBefore(LocalTime.of(22, 59))) {
            greeting = "Добрый вечер, ";       
        } else {          
            greeting = "Доброй ночи, ";       
        }        
    System.out.println(greeting + name + "!");
    iScanner.close();    
    } 
}
    
