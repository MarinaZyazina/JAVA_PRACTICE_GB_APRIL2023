/*Дан массив двоичных чисел, например [1,1,0,1,1,1], 
вывести максимальное количество подряд идущих 1.*/

public class LessonOneTask2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, 1, 1, 1};
        int count = 0;
        int max_value = 0;
        for (int i: arr) {
            if (i == 1) count++;
            else {
                if (count > max_value) {
                    max_value = count;
                    count = 0;
                }
            }
        }
if (count > max_value) max_value = count;
System.out.println(max_value);
    }    
}