package com.develop.consoleapp;

public class Class1 {

    public Data[] getData(int count) {
        Data[] data = new Data[count];
        for (int i = 0; i < count; i++) {
            data[i] = new Data();
        }
        return data;
    }

}
