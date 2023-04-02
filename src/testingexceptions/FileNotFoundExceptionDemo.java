package testingexceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileNotFoundExceptionDemo {

	public static void main(String[] args) {
		
		try {
			File file = new File( " C:testing.txt ");
			FileReader test = new FileReader( file );
		}
		catch( FileNotFoundException e){
			System.out.println(" File Not Found Exception! ");
		}
	}

}
