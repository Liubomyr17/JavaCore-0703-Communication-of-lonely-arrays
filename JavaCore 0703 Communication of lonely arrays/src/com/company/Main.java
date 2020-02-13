package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*

0703 Общение одиноких массивов

        1. Создать массив на 10 строк.
        2. Создать массив на 10 чисел.
        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        4. В каждую ячейку массива чисел записать длину строки из массива строк,
        индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
        Вывести содержимое массива чисел на экран,
        каждое значение выводить с новой строки.

        Требования:
        1.Программа должна создавать массив на 10 строк.
        2.Программа должна создавать массив на 10 целых чисел.
        3.Программа должна считывать строки для массива с клавиатуры.
        4.Программа должна в массив чисел записать длины строк
        из массива строк, а затем их вывести на экран.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];
        int[] ints = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();
            ints[i] = strings[i].length();
        }

        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}








