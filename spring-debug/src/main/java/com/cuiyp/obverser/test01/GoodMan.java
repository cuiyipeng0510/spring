package com.cuiyp.obverser.test01;

public class GoodMan implements Observer{
    @Override
    public void make(String str) {
        System.out.println("开始行动");
        System.out.println("--------"+str);
    }
}
