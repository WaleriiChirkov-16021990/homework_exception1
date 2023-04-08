import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Hello world!");
		Class_for_trow_exception c = new Class_for_trow_exception();
//		System.out.println(Class_for_trow_exception.readLocalFile("src/fileInt.txt"));
//		System.out.println(Class_for_trow_exception.readLocalFile("src/fileString.txt"));
//		c.list = new ArrayList<>();
		c.addList(4);
		c.array[1] = 4;
		c.array[3] = "fge";
		
	}
	
	
	
}