package com.blueskyhe.blueskydesignpattern.strategypattern.domain;

/**
 * Created by yiding on 6/3/15.
 */
public class CashReturn implements CashSuper {

    private double moneyCondition = 1;
    private double moneyReturn = 1;

    public CashReturn(String moneyCondition, String moneyReturn) {

        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);

    }

    @Override
    public double acceptCash(double money) {

        double result = money;

        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }

        return result;

    }
}
