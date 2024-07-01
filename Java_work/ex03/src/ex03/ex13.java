package ex03;

import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double a=scan.nextDouble();
		int b = (int)(a*100);
		System.out.println(b);
		System.out.println(b/(double)100);
		
	}
}
