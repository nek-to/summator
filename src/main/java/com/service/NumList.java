package com.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumList {
    List<Double> numList = new ArrayList<Double>();
    Scanner scanner = new Scanner(System.in);
    Double sum = 0.0;

    public NumList() {
    }

    public List<Double> setNumList() {
        while (scanner.hasNextDouble()) numList.add(scanner.nextDouble()); // if not number -> close
        if (numList.size() == 0) System.out.println("There's no any numbers :("); // zero size message
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
        try {
            FileWriter writer = new FileWriter("sum_result.txt", true);// add history - true | else - false
            writer.write(String.valueOf(sum));
            writer.write('\n'); //add sum history by \n
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
