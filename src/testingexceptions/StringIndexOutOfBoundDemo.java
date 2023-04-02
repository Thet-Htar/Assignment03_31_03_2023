package testingexceptions;

public class StringIndexOutOfBoundDemo {
	public static void main(String[] args) {
		
		try {
			String test = " I am tesing ";
			char alphabet = test.charAt(40);
			System.out.println(alphabet);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out of Bound Exception! ");
		}
	}
}
