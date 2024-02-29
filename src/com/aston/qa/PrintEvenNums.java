package com.aston.qa;

public class PrintEvenNums {
     /*
    3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]. Необходимо написать программу, которая выведет в консоль все чётные числа.
    * */

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            for (Integer num : nums) {
                if(num % 2 == 0) 
                    System.out.print(num +  " ");
            }
        }
        catch (NullPointerException e){}

    }
}
