package com.develop.consoleapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClass {

    @Test
    public void testMe() {
        Class2 class2 = new Class2();
        int result = class2.executeDataGetter();
        assertTrue(result == 175);
    }
}
