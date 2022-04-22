package com.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumList {
    List<Double> numList = new ArrayList<Double>();
    Scanner scanner = new Scanner(System.in);
    Double sum = 0.0;

    public NumList(Scanner scanner) {
        this.scanner = scanner;
    }

    public NumList() {
    }


    public List<Double> setNumList() {
        while (scanner.hasNextDouble()) numList.add(scanner.nextDouble()); // if not number -> close
        if (numList.isEmpty())
            System.out.println("There's no any numbers :("); // zero size message | numList.size() == 0 -> numList.isEmpty();
        return numList;
    }

//    public List<Integer> setNumList(Integer n){
//        for (int i = 0; i < n; i++) {
//            numList.add(i);
//        }
//        return numList;
//    }

    public Double sumMethod() {
        for (Double num : numList) {
            sum += num;
        }
        System.out.println(sum);
        return sum;
    }

    public void saveInFile(File name) {
        try (FileWriter writer = new FileWriter(name, false)) {// add history - true | else - false
            writer.write(String.valueOf(sum));
//            writer.write('\n'); //add sum history by \n
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
