package com.runapp;

import com.service.NumList;

import java.io.IOException;
import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Press any keys to exit.\n Enter some numbers for sum: ");
        NumList numList = new NumList();
        numList.setNumList();
        numList.sumMethod();
        numList.saveInFile();
    }
}
