package exam;

import java.util.Scanner;

/**
 * Ex01
 */
public class Ex01 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double a= scan.nextDouble();
    int b= (int) (a*100);
    System.out.println(b);
    System.out.println(a/(double)100);

  }
}