package probleme_codeabbey;

import java.util.Scanner;

public class Sumofdigits {
	//	This programming exercise is intended to introduce numeral system basics to you. We start learninig this concept by playing with decimal system which we use everyday (though you should keep in mind that computer does not use it internally - it only converts numbers to it when they should be shown to user).
	//
	//	As any number greater than 9 is represented by several digits, we can calculate the sum of these digits. For example, for numbers 1492 and 1776 we get:
	//
	//	1 + 4 + 9 + 2 = 16
	//	1 + 7 + 7 + 6 = 21
	//	In this task you will be given several numbers and asked to calculate their sums of digits.
	//
	//	Important: while many programming languages have built-in functions to convert numbers to strings (from which digits could be extracted), you should not use this (since your goal is to learn some programming tricks).
	//
	//	Instead you need to implement algorithm with repetitive division by 10 (base of numeral system) and summing up the remainders. Read the Number to digits article for details on the algorithm.
	//
	//	Problem statement
	//	Input data are in the following format:
	//
	//	first line contains N - the number of values to process;
	//	and then N lines will follow describing the values for which sum of digits should be calculated by 3 integers A B C;
	//	for each case you need to multiply A by B and add C (i.e. A * B + C) - then calculate sum of digits of the result.
	//	Answer should have N results, also separated by spaces.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String returnSum = "";
		int m;
		int g;
		int l=s.nextInt();
		for(int i=0; i<l; i++) {
			m = s.nextInt()*s.nextInt();
			g = m + s.nextInt();
			int sum=0;
			while(g!=0) {
				sum +=g%10;
				g /=10;
			}
			returnSum += sum + " ";
		}
		System.out.println(returnSum);


	}

}
