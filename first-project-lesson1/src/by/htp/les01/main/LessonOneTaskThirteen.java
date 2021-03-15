package by.htp.les01.main;

public class LessonOneTaskThirteen {
	public static void main(String[] args) {
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
