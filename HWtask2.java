package HW;

import java.util.ArrayList;
import java.util.Random;

public class HWtask2 {
    public static void main(String[] args) {
        // Пусть дан произвольный список целых чисел, удалить из него четные числа
        ArrayList<Integer> newList = getArrayList(10, 0, 10);
        
        System.out.println("исходный список:");
        System.out.println(newList);

        ArrayList<Integer> listWithoutEvenNum = deleteEvenNumbers(newList);
        System.out.println("обработанный список без четных чисел:");
        System.out.println(listWithoutEvenNum);


    }

    public static ArrayList<Integer> deleteEvenNumbers(ArrayList<Integer> array) {
        // создает новый массив, удаляя четные числа из исходного
        ArrayList<Integer> resList = new ArrayList<Integer>(array.size());

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) continue;
            else resList.add(array.get(i));
        }
        return resList;
    }

    public static ArrayList<Integer> getArrayList(int size, int min, int max) {
        // генерация массива с случайными числами
        ArrayList<Integer> resultList = new ArrayList<>(size);

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            resultList.add(rand.nextInt(min, max));
        }

        return resultList;
    }
}
