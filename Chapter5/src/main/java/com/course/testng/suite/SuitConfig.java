package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//test运行前的方法,共有
public class SuitConfig {
//    演示类
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite 运行啦");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行啦");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }
    @AfterTest
    public void aferTest(){
        System.out.println("after test");
    }
}
