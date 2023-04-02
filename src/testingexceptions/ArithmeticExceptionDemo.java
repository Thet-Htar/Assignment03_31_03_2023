package testingexceptions;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		try {
			int a = 5;
			int b = 0;
			int result = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(" Arithmetic Exception Error! ");
			System.out.println( " Can't divided by zero ");
		}
	}

}
