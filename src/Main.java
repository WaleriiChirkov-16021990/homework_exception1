import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Class_for_trow_exception c = new Class_for_trow_exception();
//		System.out.println(Class_for_trow_exception.readLocalFile("src/fileInt.tx"));
//		    Строка выше попытается считать не существующий файл, и мы получим Exception +  предусмотренное сообщение об инциденте;
//		System.out.println(Class_for_trow_exception.readLocalFile("src/fileInt.txt"));
//          Строка выше прочитает существующий файл , в котором лежат валидные данные для программы
//		System.out.println(Class_for_trow_exception.readLocalFile("src/fileString.txt"));
//          Строка выше прочтёт существующий файл, в котором лежат не валидные данные, получаем Exception + информационное сообщение
//		c.list = new ArrayList<>(); //
//		c.addList(4);  //
//		    @ 2 строки выше демонстрируют нам алгоритм по обработке 1 исключения (NullPointerException) Если не рассскомментировать строку 13, не произойдет
//		инициализация списка, и при попытки добавления любого элемента в этот список мы получим исключение.
		System.out.println(c.divNumbers(1,0)); // Данная мтрока предупредит пользователя о попытке деления на 0 и вернет "0"
		System.out.println(c.divNumbers(10,5)); // А эта строчка выполнит деление, так как в ней нет арифметических ошибок и вернет результат = "2".
		
	}
	
	
	
}