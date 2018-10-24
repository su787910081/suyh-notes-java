package cn.tedu.demo;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		// demo04();
		// demo05();
		// demo06();
		demo07();
	}

	private static void demo07() {

	}

	private static void demo06() {
		File file = new File("D:" + File.separator);
		File[] files = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// dir: ��Ŀ¼��name: ���������ļ���
				File dest = new File(dir, name);
				return dest.isFile() && name.endsWith(".txt");
			}
		});

		if (files != null) {
			for (File f : files) {
				System.out.println(f);
			}
		}
	}

	private static void demo05() {
		File file = new File("D:" + File.separator);

		File[] files = file.listFiles(new FileFilter() {

			@Override
			public boolean accept(File file) {
				// ��.sql ��β���ļ�
				boolean flag1 = file.isFile();
				boolean flag2 = file.getName().endsWith(".txt");
				return flag1 && flag2;
			}
		});

		if (files != null) {
			for (File f : files) {
				System.out.println(f);
			}
		}
	}

	private static void demo04() throws IOException {
		// �����ļ�
		File file = new File("E:" + File.separator + "a.txt");
		boolean bCreate = file.createNewFile();
		boolean bFile = file.isFile();
		boolean bDir = file.isDirectory();
		long nLen = file.length();
		boolean bDelete = file.delete();

		System.out.println(bCreate);
		System.out.println(bFile);
		System.out.println(bDir);
		System.out.println(nLen);
		System.out.println(bDelete);
	}

	public static void demo01() {
		File file = new File("c:" + File.separator + "test.txt");
		System.out.println(file);
	}

	public static void demo02() {
		File file = new File("C:" + File.separator + "test");
		File fileChild = new File(file, "a.txt");
		System.out.println(fileChild);
	}

	public static void demo03() {
		File file = new File("c:", "b.txt");
		System.out.println(file);
	}
}