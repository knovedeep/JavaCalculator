import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
	
	
		System.out.println((add(5,6)));
		System.out.println((subtract(56,5)));
		System.out.println((multiply(3,76)));
		System.out.println((divide(1435,655)));
		System.out.println((square(4)));
		System.out.println((power(3,3)));
	}
	
	public static int add(int num1,int num2) {
		
		return num1 +num2;
		
	}
	public static int subtract(int num1,int num2) {
		
		
		return num1 - num2;
		
	}
	public static int multiply(int num1,int num2) {
		
		
		return num1 * num2;
		
	}
	public static int divide(int num1,int num2) {
		
		
		return num1 / num2;
		
	}
	public static int square(int num3) {
		return num3 * num3;
		
	}
	public static int power(int base, int exponent) {
		int power=1;
		for (int i=1; i<=exponent;i++)
			power = power *base;
		return power;
		}
	}

	


