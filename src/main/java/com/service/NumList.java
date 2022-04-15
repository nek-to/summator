package com.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NumList {
    List<Double> numList = new LinkedList<Double>();
    Scanner scanner = new Scanner(System.in);

    public List<Double> setNumList() {
        while (scanner.hasNextInt()) numList.add(scanner.nextDouble());
        return numList;
    }

    public void sumMethod() {
        Double sum = 0.0;
        for (Double num : numList) {
            sum+=num;
            System.out.println(num);
        }
        System.out.println(sum);
    }
}
