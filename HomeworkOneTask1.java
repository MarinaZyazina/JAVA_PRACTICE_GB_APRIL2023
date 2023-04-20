/*Написать метод, принимающий на вход два аргумента: len и initialValue, и 
возвращающий одномерный массив типа int длиной len, 
каждая ячейка которого равна initialValue.*/

public class HomeworkOneTask1 {
    public static void main(String[] args) {
        int len = 5, initialValue = 2; 
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            // System.out.print("[" + i + "]" + arr[i] + " ") // вывод с индексами;
            System.out.print(arr[i] + " ");
        }
    }    
}    
