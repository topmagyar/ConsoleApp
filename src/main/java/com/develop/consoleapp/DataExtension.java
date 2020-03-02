package com.develop.consoleapp;

public abstract class DataExtension {

    public static long summarize(Data data1, Data data) {
        data.setNumber1(data.getNumber1() * data.getNumber2());
        return data1.getNumber1() * data1.getNumber2() + data.getNumber1();
    }

    protected abstract long summarize(Data data);

}
