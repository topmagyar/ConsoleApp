package com.develop.consoleapp;

public class Data extends DataExtension {
    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return "Number1: " + this.number1 + " Number2: " + this.number2;
    }

    @Override
    protected long summarize(Data data) {
        data.setNumber1(data.getNumber1() * data.getNumber2());
        return getNumber1() * getNumber2() + data.getNumber1();
    }
}
