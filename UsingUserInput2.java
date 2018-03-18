import java.util.Scanner;

public class UsingUserInput2 {

	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("Hey whats your best pokemon");
		scanner = new Scanner(System.in);
		String pokemon = scanner.nextLine();
		System.out.println("And what level is it (please enter with only whole numbers)");
		int pokeLvl = scanner.nextInt();
		System.out.println("Thats pretty cool I have a " + pokemon + " too but its level " + (pokeLvl + 5) + ". Guess mine is just better");
	}

}
