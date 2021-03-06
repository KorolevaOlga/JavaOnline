package com.epam.JavaIntro.Flowers.main;

/*Создать консольное упражнение, удовлетворяющее следующим требованиям:
•	Корректно спроектируйте и реализуйте предметную область задачи.
•	Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
•	Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента. 
•	Для проверки корректности передеанных данных можно применить регулярные выражения
•	Меню выбора действия пользователем можно не реализовывать, используте заглушку.
•	Особое условие: переопределите, где необходимо, методы toString(), equals(0, hashCode().

Вариант А. Цветочная композиция. Реализоват ьприложение, позволяющее сочиетать цветочные композиции (объект, представляющий цветочную композицию).
Составляющими цветочной композиции являются цветы и упаковка.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new MenuBouquet(new Scanner(System.in)).start();
    }
}
