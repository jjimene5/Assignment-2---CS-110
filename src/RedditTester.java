import java.io.*;
import java.io.File;
import java.util.Scanner;
public class RedditTester {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);	
		RedditReader user = new RedditReader();
		System.out.println("Hello user! I am the DSB or Data Science Bot.");
		System.out.println("What would you like to do today?");
		System.out.println("A. See how many times one keyword is displayed. \n B. See how many times two keywords are displayed in the same sentence.");
		String userChoice = keyboard.nextLine().toLowerCase();

		if (userChoice.equals("a")) {
			System.out.println("You indicated that you would like to see how many times sentences related to a certain topic are displayed. \n What is this keyword?");
			String keyword1 = keyboard.nextLine().toLowerCase();
			System.out.println("Ok! We will now search for sentences with the word:" + keyword1);
			user.getNumKeyword1();
		}
		else if (userChoice.equals("b")) {
			System.out.println("You indicated that you would like to see how many two keywords appear in the same sentence.");
			System.out.println("What is your first keyword?");
			String keyword2 = keyboard.nextLine().toLowerCase();
			System.out.println("What is your second keyword?");
			String keyword3 = keyboard.nextLine().toLowerCase();
			System.out.println("Ok! We will now search for sentences with the words: " + keyword2 + " and " + keyword3);
user.getNumKeyword2and3();
		}
		else {
			System.out.println("You have input an incorrect option.");
		}
	}
}
