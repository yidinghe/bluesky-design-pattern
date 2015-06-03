package com.blueskyhe.blueskydesignpattern.strategypattern.domain;

/**
 * Created by yiding on 6/3/15.
 */
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {

        return money;

    }
}
