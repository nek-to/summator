package com.runapp;

import com.service.NumList;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainAppTest {
    Scanner mockScan = mock(Scanner.class);
    NumList numList = new NumList(mockScan);


    public MainAppTest() {
        mockScan = mock(Scanner.class);
        this.numList = new NumList(mockScan);
    }

    @Before
    public void init() {
        new MainAppTest();
        when(mockScan.hasNextDouble()).thenReturn(true).thenReturn(true).thenReturn(true).thenReturn(false);
        when(mockScan.nextDouble()).thenReturn(2.4).thenReturn(1.5).thenReturn(1.1);
    }

    @Test
    public void setNumbersList_success() {
        //When
        List<Double> doubleList = numList.setNumList();
        //Then
        assertEquals(doubleList, Arrays.asList(2.4, 1.5, 1.1));
    }

    @Test
    public void sumMethod_success() {
        //Given
        numList.setNumList();
        //When
        double actual = numList.sumMethod();
        double expected = 2.4 + 1.5 + 1.1;
        //Then
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void saveInFile_success() throws IOException {
        //Given
        File actual = new File("test.txt");
        numList.setNumList();
        numList.sumMethod();
        //When
        numList.saveInFile(actual);
        File expected = new File("test_success.txt");
        //Then
        Assert.assertEquals(FileUtils.readFileToString(expected, "utf-8"), FileUtils.readFileToString(actual, "utf-8"));
    }
}
