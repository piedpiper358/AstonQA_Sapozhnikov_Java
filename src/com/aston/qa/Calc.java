package com.aston.qa;

import java.math.*;
import java.util.Scanner;

public class Calc {
    /*
    * 1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
        - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
        - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.

    2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"

    3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]. Необходимо написать программу, которая выведет в консоль все чётные числа.

    * Плюсом будет возможность для пользователя в решении первой и второй задач ввести данные самостоятельно через консоль.
    * * */

    public static void main(String[] args) {

        String str;
        BigInteger a = null;
        BigInteger b = null;
        Scanner console = new Scanner(System.in);

        //Будем ждать пока не получим число
        do {
            try {
                str = console.nextLine();
                a = new BigInteger(str);
            } catch (NumberFormatException e) {}
        } while(a==null);


        do {
            try {
                str = console.nextLine();
                b = new BigInteger(str);
            } catch (NumberFormatException e) {}
        } while(b==null);


        //BigInteger a = new BigInteger("32145");
        //BigInteger b = new BigInteger("12345");
        compare(a,b);
        calculate(a,b);
        //calc.
    }

    static void compare(BigInteger a, BigInteger b) {

        //проверка на null!!
        try {

            if (a.compareTo(b) == 0) {
                System.out.println("a = b");
            } else if (a.compareTo(b) > 0) {
                System.out.println("a > b");
            } else if (a.compareTo(b) < 0) {
                System.out.println("a < b");
            }
        }
        catch(NullPointerException e) {}
    }

    static void calculate(BigInteger a, BigInteger b) {


        BigInteger sum =  a.add(b);
        System.out.println(sum);

        BigInteger sub =  a.subtract(b);
        System.out.println(sub);


        BigInteger res =  a.multiply(b);
        System.out.println(res);


        try {
            BigDecimal DecA = new BigDecimal(a);
            BigDecimal DecB = new BigDecimal(b);
            BigDecimal div = DecA.divide(DecB, 5, RoundingMode.CEILING);
            System.out.println(div);

        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
