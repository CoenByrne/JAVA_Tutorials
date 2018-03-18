import java.util.Scanner;

public class UsingUserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("How many cats do you have");
		int userInput = scanner.nextInt();
		if (userInput <= 1) {
			System.out.println("Thats not enough cats");
		} else if (userInput >= 2 && userInput < 5) {
			System.out.println("I'm glad to say that you have enough cats");
		} else {
			System.out.println("Wow Thats so many cats");
		}
	}

}
