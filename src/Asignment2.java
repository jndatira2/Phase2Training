import java.util.Scanner;

public class Asignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEvenNumber();

	}

	
//	5)     Print even number between 1 to 100 using for loop.
	static void printEvenNumber() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
	    
//	6) Print number 1 to 5, 5 times using nested for loop;
	static void printNum() {
		int num = 1;
		while(num<=5) {
			System.out.println(num);
			num++;
		}
	}
	
// 7)  print 1 to 25 number using while loop.
	static void print1to25() {
		int num = 1;
		while(num <= 25) {
			System.out.println(num);
			num++;
		}
	}
	
//	8)     Print odd number between 50 to 100 using do..while
	static void printOddNum() {
		for(int i = 50; i < 100; i++) {
			do {
				System.out.println(i);
			}
			while(i%2 != 0);
			
		}
	}
	
	
//	9)    Print prime number from 1 to 100.
	
	
		

	

	

}
