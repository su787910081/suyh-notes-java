package cn.tedu.demo.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Iterator {
	public static void main(String[] args) {
		// demo01();
		demo02();
	}
	
	public static void demo01()
	{
		Collection<String> col = new ArrayList<String>();
		col.add("java");
		col.add("web");
		col.add(".net");
		java.util.Iterator<String> itr = col.iterator();
		// itr.next();
		// System.out.println(itr.next());

		// �Լ��Ͻ��б����������������Ԫ�ذ�����ĸa ����Ԫ�شӼ������Ƴ�
		while (itr.hasNext()) {
			String str = itr.next();
			// ��str �����Ƿ����ַ�a �ж�
			int nIndex = str.indexOf('a');
			if (nIndex >= 0) {
				itr.remove();
			}
		}

		System.out.println(col);

		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("web");
		list.add(".net");
		
		java.util.Iterator<String> it = list.iterator();
		while (it.hasNext())
		{
			String str = it.next();
			if (str.indexOf('a') >= 0)
			{
				list.remove(0);	// �쳣������������ʹ���˼����е�remove() ������
			}
		}
	}
	
	public static void demo02()
	{
		Collection<String> col = new ArrayList<String>();
		col.add("java");
		col.add("web");
		col.add(".net");

		for (String str : col)
		{
			System.out.println(str);
		}
	}
}
