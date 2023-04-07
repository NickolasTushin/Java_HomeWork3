//Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        
    
    
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 15, 20));
    
    for (int i = 0; i < numbers.size(); i++) {
        if (numbers.get(i) % 2 == 0) {
            numbers.remove(i);
            i--;
        }
    }
    
    System.out.println(numbers); // [1, 3, 5, 7, 9]
    }    
    
}


