import java.io.File;
import java.io.FileNotFoundException;;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.Scanner;

/*
- Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
- Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
*/
public class Class_for_trow_exception <T extends Integer> {
	private ArrayList<T> list;
	
	public ArrayList<T> getList() {
		return list;
	}
	
	public void setList(ArrayList<T> list) {
		this.list = list;
	}
	
	public Logger getLogger() {
		return logger;
	}
	
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	
	private Logger logger;

	public static int readLocalFile(String path) throws FileNotFoundException,NumberFormatException {
		try (Scanner scanner = new Scanner(new File(path))) { //если файл отсутствует или в нем не валидные данные для текущей задачи, мы поймаес учключения и прекратим работу программы
			return Integer.parseInt(scanner.nextLine());
		} catch (FileNotFoundException notFoundException) {
			throw new IllegalArgumentException("File not found");
		} catch (NumberFormatException numberFormatException) {
			throw new IllegalArgumentException("Not number in file");
		}
		// при этом можно было бы записать в логгер необходимую информацию о нештатном поведении в программе, а не выбрасывать исключение (при необходимости непрерывной работы).
	}
	
	
	public void addList(T one) throws NullPointerException {
		try { //отлавливаем случай добавления в не инициализированный список
			this.list.add(one);
		} catch (NullPointerException nullPointerException) {
			throw new IllegalArgumentException("Список не инициализирован");
		}
	}
	
	public double divNumbers(int a, int b) throws ArithmeticException {
		try {  // если делитель равен 0, ничего не вылетит, но пользователь будет осведомлен о нарушении
			return a / b;
		} catch (ArithmeticException zero) {
			System.out.println("На ноль делить нельзя !");
			Logger logger = Logger.getAnonymousLogger();
			logger.info("Пользователь пробует нарушить математические правила.");
		}
		return 0; // вообще для подобных алгоритмов не принято возвращать коды ошибок, поэтому здесь возвращается не код, а просто значение 0, после осведомления о невозможности предыдущей операции.
	}


}
