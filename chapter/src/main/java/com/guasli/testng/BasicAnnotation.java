package com.guasli.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @BeforeMethod
    public void beforeMethor(){
        System.out.println("在方法之前执行");
    }
}
