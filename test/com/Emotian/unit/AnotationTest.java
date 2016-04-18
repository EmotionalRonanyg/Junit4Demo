package com.Emotian.unit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnotationTest {

/*����  assertEquals
 * 
 * @Test:��һ����ͨ��������Ϊ���Է���
 * 	  @Test(expected=XXX.class)
 * 	  @Test (timeout=����)
 * 
 * 
 * @BeforeClass:���Ὣ���еķ�������ǰ��ִ�У�static����
 * @AfterClass:���������з������н�����ִ�� static����
 * @Before:  ����ÿ�����Է���֮ǰ��ִ��һ��
 * @After:����ÿ�����Է���֮������һ��
 * 
 * @Ignore:�����εĲ��Է����ᱻ���������
 * @RunWith:���Ը��Ĳ������л��� org.junit.runner.Runner
 * */
	
	
	@Test(expected=ArithmeticException.class)
	public void testDivide(){
		assertEquals(2,new Calculate().divide(6, 0));
	}
	
	@Ignore("Ϊʲô��������")
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
