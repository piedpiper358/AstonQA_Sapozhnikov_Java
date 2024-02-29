package com.aston.qa;

import java.math.BigInteger;
import java.util.Scanner;

public class CompareStrings {
    /*
    2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
    В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
     */

    public static void main(String[] args) {
        //https://javarush.com/groups/posts/760-java-string-voprosih-k-sobesedovaniju-i-otvetih-na-nikh-ch2

        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        String b = console.nextLine();

        if (a.equals(b)){
            System.out.print("Строки идентичны");
        }
        else{
            System.out.print("Строки неидентичны");
        }
    }
}
