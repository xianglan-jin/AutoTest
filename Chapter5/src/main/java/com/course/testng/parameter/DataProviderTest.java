package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name=" + name + "; age=" + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"zhangsan1", 10},
                {"zhangsan2", 20},
                {"zhangsan3", 30}
        };
        return o;
    }

    //不同方法传递不同参数
    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test method 1111,name=" + name + ";age=" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test method 2222,name=" + name + ";age=" + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"zhangsan1", 10},
                    {"zhangsan2", 20},
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"zhangsan3", 30},
                    {"zhangsan4", 40},
            };
        }
        return result;
    }
}
