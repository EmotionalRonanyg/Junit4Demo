package com.Emotian.unit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnotationTest {

/*断言  assertEquals
 * 
 * @Test:将一个普通方法修饰为测试方法
 * 	  @Test(expected=XXX.class)
 * 	  @Test (timeout=毫秒)
 * 
 * 
 * @BeforeClass:他会将所有的方法运行前被执行，static修饰
 * @AfterClass:他会在所有方法运行结束后执行 static修饰
 * @Before:  会在每个测试方法之前被执行一次
 * @After:会在每个测试方法之后被运行一次
 * 
 * @Ignore:所修饰的测试方法会被测试类忽略
 * @RunWith:可以更改测试运行机器 org.junit.runner.Runner
 * */
	
	
	@Test(expected=ArithmeticException.class)
	public void testDivide(){
		assertEquals(2,new Calculate().divide(6, 0));
	}
	
	@Ignore("为什么忽略他？")
	@Test(timeout=50000)
	public void testWhile(){
		while(true){
			System.out.println("runforver");
		}
		
		
	}
	@Test(timeout=3000)
	public void testReadFile(){
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
			
			
		}
	}

}
