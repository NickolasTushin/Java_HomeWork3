//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Task2 {
public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    
 
    int min = Collections.min(numbers);
    System.out.println("Минимальное значение: " + min);

    int max = Collections.max(numbers);
    System.out.println("Максимальное значение: " + max);
    

    double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);
    System.out.println("Среднее арифметическое значение: " + average);
    
}
    
}