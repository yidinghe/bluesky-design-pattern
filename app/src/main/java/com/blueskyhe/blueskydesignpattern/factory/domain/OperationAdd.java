package com.blueskyhe.blueskydesignpattern.factory.domain;

/**
 * Created by yiding on 5/28/15.
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() + getNumberB();
        return result;
    }
    
}
