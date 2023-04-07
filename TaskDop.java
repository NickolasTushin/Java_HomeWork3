//(Дополнительное) Реализовать алгоритм сортировки слиянием

import java.util.Arrays;
public class TaskDop {


public static void mergeSort (int[] array, int leftIndex, int rightIndex) {
    if (leftIndex < rightIndex) {
        int middleIndex = (leftIndex + rightIndex) / 2;
        mergeSort(array, leftIndex, middleIndex);
        mergeSort(array, middleIndex + 1, rightIndex);
        merge(array, leftIndex, middleIndex, rightIndex);
    }
}

public static void merge(int[] array, int leftIndex, int middleIndex, int rightIndex) {
    int[] tempArray = new int[array.length];
    for (int i = leftIndex; i <= rightIndex; i++) {
        tempArray[i] = array[i];
    }
    int i = leftIndex;
    int j = middleIndex + 1;
    int k = leftIndex;
    while (i <= middleIndex && j <= rightIndex) {
        if (tempArray[i] <= tempArray[j]) {
            array[k] = tempArray[i];
            i++;
        } else {
            array[k] = tempArray[j];
            j++;
        }
        k++;
    }
    while (i <= middleIndex) {
        array[k] = tempArray[i];
        k++;
        i++;
    }
}
public static void main(String[] args) {
    

int[] array = { 5, 2, 8, 4, 1, 7, 3 };
mergeSort(array, 0, array.length - 1);
System.out.println(Arrays.toString(array));

    }
}