import java.io.File;
import java.io.FileNotFoundException;;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
- Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
- Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
*/
public class Class_for_trow_exception <T extends Integer> {
	ArrayList<T> list;
	int[] array = new int[10];
	String string;

	public static int readLocalFile(String path) throws FileNotFoundException,NumberFormatException {
		try (Scanner scanner = new Scanner(new File(path))) {
			return Integer.parseInt(scanner.nextLine());
		} catch (FileNotFoundException notFoundException) {
			throw new IllegalArgumentException("File not found");
		} catch (NumberFormatException numberFormatException) {
			throw new IllegalArgumentException("Not number in file");
		}
		// при этом можно было бы записать в логгер необходимую информацию о нештатном поведении в программе, а не выбрасывать исключение (при необходимости непрерывной работы).
	}
	
	
	public void addList(T one) throws NullPointerException {
		try {
			this.list.add(one);
		} catch (NullPointerException nullPointerException) {
			throw new IllegalArgumentException("Список не инициализирован");
		}
	}
	
	public void addArray(String s) {
	}


}
