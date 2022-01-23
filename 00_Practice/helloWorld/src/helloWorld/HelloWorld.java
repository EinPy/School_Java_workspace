package helloWorld;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int date, month, year;
		String day;
		System.out.println("What is todays date?");
		Scanner in = new Scanner(System.in);
		day = in.nextLine();
		System.out.println("The day is: " + day);
		System.out.println("what is todays date in numbers");
		date = in.nextInt();
		System.out.println(date);
	}

}
