package com.Emotian.unit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit4Test {

	
	/*
	 * 1��@BeforeClass���εķ����������з���������ǰִ��
	 * ���Ҹ÷����Ǿ�̬�� �����Ե������౻���غ���žͻ�������
	 * �������ڴ�����ֻ�����һ��ʵ�����Ƚ��ʺϼ��������ļ�
	 * 2��@AfterClass�����εķ���ͨ����������Դ��������ر����ݿ�����
	 * 3��@Before��@After����ô�����Է�����ǰ���ִ��һ��
	 * 
	 * 
	 * */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("this is BeforClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	System.out.println("this is AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is Befor");	
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is After");
	}

	@Test
	public void test1(){
		
	System.out.println("this is @Test11...");
	}
	@Test
	public void test2(){
		
	System.out.println("this is @Test22...");
	}

}
