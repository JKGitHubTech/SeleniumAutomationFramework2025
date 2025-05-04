package testng;

import org.testng.annotations.Test;

public class TestCases1 {

    @Test(groups={"sanity"})
    void test1(){
        System.out.println("I am Inside Test1");
    }

    @Test(groups={"sanity"})
    void test2(){
        System.out.println("I am Inside Test2");
    }

    @Test(groups={"smoke"})
    void test3(){
        System.out.println("I am Inside Test3");
    }
}
