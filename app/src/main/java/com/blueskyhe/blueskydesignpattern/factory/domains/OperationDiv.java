package com.blueskyhe.blueskydesignpattern.factory.domains;

/**
 * Created by yiding on 5/29/15.
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        if (getNumberB() == 0) {
            return 0;
        }

        result = getNumberA() / getNumberB();
        return result;

    }

}
