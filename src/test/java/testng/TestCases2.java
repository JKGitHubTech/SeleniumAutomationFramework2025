package testng;

import org.testng.annotations.Test;

public class TestCases2 {

    @Test(priority=-1)
    void test1(){
        System.out.println("I am Inside Test1 priority=-1");
    }

    @Test(priority=0)
    void test2(){
        System.out.println("I am Inside Test2 priority=0");
    }

    @Test(priority=1)
    void test3(){
        System.out.println("I am Inside Test3 priority=1");
    }

}
