package com.calculator;

import interfaces.ActionInterface;

public class Calculator {

    public int calcute (ActionInterface actionInterface, int a, int b) {
        int cal = actionInterface.action(a, b);
        return cal;
    }


}
