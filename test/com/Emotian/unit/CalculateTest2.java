package com.Emotian.unit;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * 1�����Է����ϱ���ʹ��@Test
 * 2�����Է�������ʹ��public void �������Σ����ܴ��κβ���
 * 3���½�һ��Դ����Ŀ¼����Ų��Դ���
 * 4��������İ�Ӧ�úͱ������ౣ��һ��
 * 5�����Ե�Ԫ�е�ÿ������������Զ������ԣ����Է����䲻�����κ�����
 * 6�������൥Ԫʹ��Test��Ϊ�����ĺ�׺�����Ǳ��룩��
 * 7�����Է���ʹ��test��Ϊ��������ǰ׺�����Ǳ��룩
 * */
public class CalculateTest2 {

	@Test
	public void testAdd(){
		assertEquals(6,new Calculate().add(3, 3));
	}
	
	@Test
	public void testSubtract(){
		assertEquals(3,new Calculate().subtract(6, 3));
	}
	@Test
	public void testMultiply(){
		assertEquals(9,new Calculate().multiply(3, 3));
	}
	@Test
	public void testDivide(){
		assertEquals(2,new Calculate().divide(6, 3));
	}
}
