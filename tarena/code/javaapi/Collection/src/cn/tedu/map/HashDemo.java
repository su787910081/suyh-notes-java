package cn.tedu.map;

import cn.tedu.demo.Student;

/*
 * hashCode() - int Object ���е�һ�����������������ڴ��еĵ�ַ����
 */
public class HashDemo {
	public static void main(String[] args) {
		demo01();
	}
	
	public static void demo01()
	{
		Student student = new Student();
		int addr = student.hashCode();
		System.out.println(addr);
		System.out.println(student);
	}
}