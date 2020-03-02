package com.develop.consoleapp;

public class Class2 {

    public int executeDataGetter() {
        return this.process();
    }

    private int process() {
        int val = 0;
        Class1 class1 = new Class1();
        Data[] d = class1.getData(10);
        for (int i = 0; i < 6; i++) {
            Data data = new Data();
            data.setNumber1(i * 10);
            data.setNumber2(-(i % 3) - 1);
            d[i] = data;
        }
        int byteSize = (int) Math.pow(2, Byte.SIZE);
        boolean negative;
        for (int i = 0; i < 10; i += 2) {
            long sum = d[i].summarize(d[i + 1]);
            if (sum < 0) {
                negative = true;
                sum = ((long) Integer.MAX_VALUE + 1) * 2 - Math.abs(sum);
            } else {
                negative = false;
            }
            int counter = 0;
            while (sum > 0) {
                int q = (int) (sum % byteSize);
                val ^= q;
                sum /= byteSize;
                counter++;
            }
            for (int j = counter; j < Integer.BYTES; j++) {
                if (negative) {
                    val ^= (byteSize - 1);
                } else {
                    val ^= 0;
                }
            }
        }
        return val;
    }

}
