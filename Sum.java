package probleme_codeabbey;

import java.util.Scanner;

public class Sum {
	//	Since starting could be hard sometimes, let us try the simplest problem possible. The goal is to have practice on submitting answers etc.
	//
	//	We need to sum two numbers and tell the result. Though you can do it manually, try to write a simple program in any language you know, or like, or want to learn.
	//
	//	This screencast video demonstrates steps described further.
	//
	//	How to submit solution
	//	If you are logged in, you will see the following fields below:
	//
	//	Test data contains "input data" or "test-case" - two numbers which we want to sum.
	//	Your answer - is where you put your result after processing test data.
	//	Your solution - is where you save your program code. It would not be checked (at least automatically), but it will help you reuse your code in the next tasks. You can revisit the task any time to see your submitted solution.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(in.nextInt() + in.nextInt());
	}

}
