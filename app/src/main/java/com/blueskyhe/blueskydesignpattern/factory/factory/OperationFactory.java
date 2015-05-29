package com.blueskyhe.blueskydesignpattern.factory.factory;

import com.blueskyhe.blueskydesignpattern.factory.domains.Operation;
import com.blueskyhe.blueskydesignpattern.factory.domains.OperationAdd;
import com.blueskyhe.blueskydesignpattern.factory.domains.OperationDiv;
import com.blueskyhe.blueskydesignpattern.factory.domains.OperationMul;
import com.blueskyhe.blueskydesignpattern.factory.domains.OperationSub;

/**
 * Created by yiding on 5/29/15.
 */
public class OperationFactory {

    private static final String OPERATION_ADD = "+";
    private static final String OPERATION_SUB = "-";
    private static final String OPERATION_MUL = "*";
    private static final String OPERATION_DIV = "/";


    public static Operation createOperation(String operation) {

        Operation oper = null;
        switch (operation) {
            case OPERATION_ADD:
                oper = new OperationAdd();
                break;
            case OPERATION_SUB:
                oper = new OperationSub();
                break;
            case OPERATION_MUL:
                oper = new OperationMul();
                break;
            case OPERATION_DIV:
                oper = new OperationDiv();
                break;
            default:
                oper = new Operation();
                break;
        }
        return oper;

    }

    public static String[] getAllOperations() {

        return new String[]{OPERATION_ADD, OPERATION_SUB, OPERATION_MUL, OPERATION_DIV};
        
    }
}
