/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 * и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно:
 * При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */

public class Division_elements_of_array {
	
	
	public double[] div(int[] a, int[]b) throws RuntimeException {
		if (a == null) {  //проверка первого массива на null
			throw new RuntimeException("Первый массив = null");
		} else if (b == null) {  //проверка второго массива на null
			throw new RuntimeException("Второй массив = null");
		}
		if (a.length != b.length) { //массивы разной длины
			throw new RuntimeException("Массивы разной длины!");
		}
		
		// если мы тут , значит нам повезло, и все условия удовлетворяют началу решения задачи деления
		double[] result = new double[a.length];
 		for (int i = 0; i < a.length; i++) {
		    if (b[i] != 0) {                // в цикле проводим проверку , не пытаемся ли мы делить на 0
			    result[i] = a[i] / b[i];
		    } else {                        // если пытаемся , работа программы прекратится, а пользователь узнает почему произошел сбой.
				throw new RuntimeException("Второй массив содержит 0, деление на 0 не возможно!");
		    }
		}
		 // в случае успеха на всех этапах решения, мы получаем результирующий массив
		return result;
	}
	
}
