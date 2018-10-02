package cn.tedu.equals;

public class PointTest {
	public static void main(String[] args) {
		Point p1 = new Point(20, 30);
		Point p2 = new Point(20, 30);
		Point p3 = p1;
		
		boolean flag = p1.equals(p2);
		System.out.println(flag);
		System.out.println(p1 == p3);
		System.out.println(p1.equals(p3));
	}
}