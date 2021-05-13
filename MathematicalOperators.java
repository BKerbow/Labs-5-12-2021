package labPackageHolder;

public class MathematicalOperators {

	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		int z;
		
		//Simple Addition
		z = x + y;
		System.out.println(z);
		//Simple Subtraction
		z = x - y;
		System.out.println(z);
		//Simple Multiplication
		z = x * y;
		System.out.println(z);
		//Simple Division
		z = x / y;
		System.out.println(z);
		//Simple Modulus
		z = x % y;
		System.out.println(z);
		//Float vs Int
		float f = 3.4f;
		int i = 22;
		
		double result = (int)f + i;
		System.out.println(result);
	}
}
