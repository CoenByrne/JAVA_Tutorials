import java.util.Scanner;

public class Password {

	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String password = "password";
		System.out.println("Please enter password");
		String userInput = scanner.nextLine();
		
		if (userInput.equals(password)) {
			System.out.println("Welcome!");
		} else {
			System.out.println("thats not the password");
		}
		
		scanner.close();
	}
}
