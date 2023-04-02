package testingexceptions;

public class MultipleTryCatchBlkDemo {
	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			System.out.println(arr[7]);
			arr[5] = 3/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" Array Index Out of Bound! ");
		}
		catch(ArithmeticException e) {
			System.out.println( " Arithmetic Expection! ");
		}
		catch( Exception e) {
			System.out.println(" Parent Exception! ");
		}
		finally {
			System.out.println(" This program ends here! ");
		}
	}
}
