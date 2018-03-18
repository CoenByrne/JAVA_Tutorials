import java.util.Scanner;

public class UsingInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome!");
		System.out.println("Please input first number");
		int n1 = scanner.nextInt();
		System.out.println("Please input second number");
		int n2 = scanner.nextInt();
		System.out.println("the result is " + (n1 * n2));
	}

}
