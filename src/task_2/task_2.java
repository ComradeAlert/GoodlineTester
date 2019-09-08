package task_2;

/*
Задача 2
Часть первая
Вам дана строка, содержащая пробелы. Найдите, сколько в ней слов (слово – это последовательность непробельных символов,
слова разделены одним пробелом, первый и последний символ строки – не пробел).

Входные данные
На вход подается файл strings.txt, внутри несколько строк.

Выходные данные
Необходимо вывести количество слов в первой из введенных строк.

Код должен быть выложен в любую систему контроля версий.
 */

import java.io.*;

public class task_2 {

	private final static String FILE_NAME = "C:/strings.txt";

	public static void main(String[] args) {
		decision(FILE_NAME);
	}

	private static void decision(String nameOfFile) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(nameOfFile));
			String line;
			String[] arrayOfLines;

			line = bufferedReader.readLine();
			bufferedReader.close();

			arrayOfLines = line.split(" ");

			System.out.println(arrayOfLines.length);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

