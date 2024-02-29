package com.aston.qa;

import java.util.Scanner;

public class CompareStrings {
    /* 2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
        В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
        Плюсом будет возможность для пользователя в решении первой и второй задач ввести данные самостоятельно через консоль */

    public static void main(String[] args) {

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
