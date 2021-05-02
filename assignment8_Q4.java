package Assignment_8;

public class assignment8_Q4 {

	public static void main(String[] args) {

		printHollowRect();

	}

	public static void printHollowRect() {

		for (int i = 1; i <= 5; i++) {

			System.out.println("*");

			for (int j = 1; j <= 4; j++) {
				
				System.out.println("*");
				
				if (j > 1 && j < 5) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
		}
	}
}
