package by.htp.les01.main;

import java.util.Scanner;

public class LessonOne {
	public static void main(String[] args) {
		System.out.println("\\n Lesson №1 Task 4");		
		double a1 = 3;
		double b1 = 4;
		double c1;
		double sq;
		
		c1 = Math.sqrt(Math.pow(a1, 2) + Math.pow(b1, 2));
		sq = a1 * b1;
		System.out.println("Гиппотенуза = " + c1);
		System.out.println("Площадь = " + sq);
		
		System.out.println("\n Lesson №1 Task 5");	
		int x2 = 1;
		int y2 = 2;
		int z2 = 3;
		int l2 = 4;
		int sum2;
		
		sum2 = x2 + y2 + z2 + l2;
		System.out.println(" Сумма четырёх чисел = " + sum2);
		
		System.out.println("\n Lesson №1 Task 6");
		int a3;
		int b3;
		int c3;
		double f3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter a :");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println(" Enter a :");
		}
		a3 = sc.nextInt();		
		System.out.println(" Enter b :");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println(" Enter b :");
		}
		b3 = sc.nextInt();
		System.out.println(" Enter c :");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println(" Enter c :");
		}
		c3 = sc.nextInt();
		f3 = Math.pow(a3,2) - Math.pow((b3 - c3), 2) + (double) Math.log(Math.pow(b3, 2)+1);
		System.out.println("a = " + a3 + "; b = " + b3 + "; c = " + c3);
		System.out.println(" a^2 - (b -c)^2 + ln(b^2 + 1) = " + f3);
		
		System.out.println("\n Lesson №1 Task 13");
		double a4 = 1.25;
		double b4 = 1.2;
		double c4 = 0.5;
		double f4;
		
		if (a4 == 0) {
			System.out.println(" a = 0, f = NaN");
			return;
		}
		f4 = (b4 + Math.sqrt(Math.pow(b4, 2)+ 4 * a4 * c4)) / (2 * a4) - Math.pow(a4, 3) * c4 + b4;
		
		System.out.println(" f4 = (b4 + Math.sqrt(Math.pow(b4, 2)+ 4 * a4 * c4)) / (2 * a4) - Math.pow(a4, 2) * c4 + b4 = " + f4);
		
	}
}
