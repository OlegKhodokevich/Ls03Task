package by.htp.les01.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Helo,world");
		Scanner sc = new Scanner(System.in);
//		int x;
//		double y;
//		System.out.println("> ");
//		x = sc.nextInt();
//		System.out.println("x = " + x);
//		y = sc.nextDouble();
//		System.out.println("y = " + y);
//		boolean b = sc.hasNextInt();
//		if (b) {
//			x = sc.nextInt();
//			System.out.println("Мы молодец   " + x);
//		} else {
//			String str = sc.nextLine();
//			System.out.print("Ты не молодец - ввёл не целое число, а ты ввёл : " + str);
//		}
//		String str = sc.nextLine();
//		System.out.print(str);

		int hi;
		while (!sc.hasNextInt()) 
		{
			sc.next();			
		}
		hi = sc.nextInt();
		System.out.println("hi = " + hi);
	}

}
