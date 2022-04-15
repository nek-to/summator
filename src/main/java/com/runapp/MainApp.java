package com.runapp;

import com.service.NumList;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Для выхода из программы нажмите любую букву.\n Введите число любое число для получения суммы: ");
        NumList numList = new NumList();
        numList.setNumList();
        numList.sumMethod();
    }
}
