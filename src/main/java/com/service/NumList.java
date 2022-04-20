package com.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * List users = new ArrayList();
 * int age = 23;
 * Можно
 * class X{
 * final List users;
 * final int age;
 * <p>
 * X() {
 * this.users = new ArrayList();
 * this.age = 23;
 * }
 * }
 */

public class NumList {
    final List<Double> numList;
    final Scanner scanner;
    Double sum;

//    public NumList() {
//    }

    public NumList() {
        this.numList = new ArrayList<Double>();
        this.scanner = new Scanner(System.in);
        this.sum = 0.0;
    }


    public List<Double> setNumList() {
        while (scanner.hasNextDouble()) numList.add(scanner.nextDouble()); // if not number -> close
        if (numList.isEmpty())
            System.out.println("There's no any numbers :("); // zero size message | numList.size() == 0 -> numList.isEmpty();
        return numList;
    }

    public Double sumMethod() {
        for (Double num : numList) {
            sum += num;
        }
        System.out.println(sum);
        return sum;
    }

    public void saveInFile() {
        try (FileWriter writer = new FileWriter("sum_result.txt", true)) {// add history - true | else - false
            writer.write(String.valueOf(sum));
            writer.write('\n'); //add sum history by \n
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
