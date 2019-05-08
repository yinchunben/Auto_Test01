package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的主机，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是测试用例运行前运行的");
    }
    @AfterMethod
    public void  AfterMethod(){
        System.out.println("AfterMethod这是测试用例运行之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是测试用例运行之后运行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是测试用例运行之后运行的");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuitec测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Aftersuite测试套件");
    }
}
