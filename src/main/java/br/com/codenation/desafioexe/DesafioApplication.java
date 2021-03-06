package br.com.codenation.desafioexe;

import java.util.List;
import java.util.ArrayList;

public class DesafioApplication {
	static List<Integer> fibonacciNumbers;

	public static void main(String[] args) {
		fibonacci();
		System.out.println(fibonacciNumbers);
	}

	public static List<Integer> fibonacci() {
		fibonacciNumbers = new ArrayList<>();
		fibonacciNumbers.add(0);
		fibonacciNumbers.add(1);
		int integerNumber = 0;
		while (integerNumber <= 350) {
			integerNumber = fibonacciNumbers.get(fibonacciNumbers.size() - 1) + fibonacciNumbers.get(fibonacciNumbers.size() - 2);
			fibonacciNumbers.add(integerNumber);
		}
		return fibonacciNumbers;
	}

	public static Boolean isFibonacci(Integer a) {
		DesafioApplication.fibonacci();
		boolean result = fibonacciNumbers.contains(a);
		return result;
	}

}
