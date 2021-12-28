//Написать программу, удаляющую из целочисленного массива A размерности N элементы, равные
//целому числу X. В результате должен получиться массив не большей размерности. На экран должны
//выводиться как оригинальное состояние массива, так и итоговое.
//package ru.javabegin.oop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите числа в коллекцию");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Float> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(Float.parseFloat(s));
        }
        System.out.println(list);

        System.out.println("Введите число, которое хотите удалить");
        float x = in.nextFloat();
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) {
                list.remove(i);
            }

        }
        System.out.println(list);
    }
}
