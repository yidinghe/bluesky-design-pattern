package com.blueskyhe.blueskydesignpattern.strategypattern.domain;

/**
 * Created by yiding on 6/3/15.
 */
public class CashRebate implements CashSuper {

    private double moneyRebate = 1;

    public CashRebate(String moneyRebate) {

        this.moneyRebate = Double.parseDouble(moneyRebate);

    }

    @Override
    public double acceptCash(double money) {

        return money * moneyRebate;
    }
}
