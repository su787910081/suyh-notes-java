package cn.tedu.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		demo01();
		demo02();
	}
	
	public static void demo01()
	{
		Queue<String> queue = new LinkedList<String>();
		queue.offer("x");
		queue.offer("b");
		queue.offer("c");
		System.out.println(queue);
	}
	
	public static void demo02()
	{
		Queue<String> queue = new LinkedList<String>();
		queue.offer("x");
		queue.offer("b");
		queue.offer("c");
		
		for (String s : queue)
		{
			System.out.println(s);
		}
		
		while (queue.size() > 0)
		{
			String str = queue.poll();
			System.out.println(str);
		}
	}
}



