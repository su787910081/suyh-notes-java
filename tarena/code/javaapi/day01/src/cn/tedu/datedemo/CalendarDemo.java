package cn.tedu.datedemo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * �õ�Calendar ���������ַ�ʽ
		 */
		Calendar calendar = new GregorianCalendar();
		
		// ��ʽ��: ʹ�þ�̬����(���÷�ʽ)
		Calendar cal = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = calendar.get(Calendar.MONTH);
		System.out.println(month);
		
		demo01();
	}
	
	public static void demo01() {
		// ��ȡ��ǰ���ڵ������յķ���
		Calendar calendar = Calendar.getInstance();
		// ��ȡʱ�����
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DATE);
		
		System.out.println(year + "-" + month + "-" + day);
		
		Date d = calendar.getTime();
		System.out.println(d);
	}
}




