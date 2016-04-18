package com.Emotian.unit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
 * 1、【测试套件】就是组织测试类一起运行的
 * 
 * 写一个作为测试套件入口类，这个类里面不包含其他方法
 * 更改测试运行机器 Suite.class
 * 将要测试的类作为数组传入到Suite.SuiteClass({})
 * 
 * 
 * */

@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class,TaskTest2.class,TaskTest3.class})

public class SuiteTest {


}
