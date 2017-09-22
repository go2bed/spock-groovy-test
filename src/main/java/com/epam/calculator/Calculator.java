package com.epam.calculator;

/**
 * @author by Администратор on 21.09.2017.
 */
public class Calculator {

    public int sum(int a, int b){
        return a + b;
    }

    public void trowIllegalException(int a){
        throw  new IllegalArgumentException("there is an a variable %{}" + a);
    }
}
