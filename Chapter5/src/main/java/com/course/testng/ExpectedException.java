package com.course.testng;

import org.testng.annotations.Test;

/*
* 什么时候会用到异常测试?
* 期望结果为某一个异常的时候,比如:传入某些不合法的参数,程序抛出异常
* */

public class ExpectedException {
    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    //这是一个测试结果会成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException(){
        System.out.println("这是一个成功的异常测试");

        throw new RuntimeException();
    }
}
