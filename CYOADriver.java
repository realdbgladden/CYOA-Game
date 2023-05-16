package cyoaGame;
import java.util.*;

public class CYOADriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";
		Integer choice = 0;

		System.out.print("Welcome to my game adventurer! What is your name?: ");
		name = input.nextLine();
		CYOAObject myAdv = new CYOAObject(name);

		myAdv.startGame();
		String s = input.next();
		try {
			choice = Integer.parseInt(s);
		} catch(NumberFormatException e) {
			//no throw up :)
		}
		while(!(choice>0 && choice < 5)) {
			System.out.println("Please choose a valid selection.");
			String a = input.next();
			try {
				choice = Integer.parseInt(a);
			} catch(NumberFormatException e) {
				//no throw up :)
			}
		} if(choice == 1 || choice == 2 || choice == 4) {
			myAdv.choice1(choice);
			System.out.println("\nWould you like to play again?");
			input.nextLine();
			String playAgain = input.nextLine();
			if(playAgain.toLowerCase().equals("yes")) {
				main(args);
			} else if(playAgain.toLowerCase().equals("no")) {
				System.exit(0);
			}
		} else {
			myAdv.choice1(3);
		}

		if(choice == 3) {
			myAdv.prompt2();
			String v = input.next();
			try {
				choice = Integer.parseInt(v);
			} catch(NumberFormatException e) {
				//no throw up :)
			}
			while(!(choice>0 && choice < 5)) {
				System.out.println("Please choose a valid selection.");
				String l = input.next();
				try {
					choice = Integer.parseInt(l);
				} catch(NumberFormatException e) {
					//no throw up :)
				}
			}
			if(choice == 4) {
				while(choice == 4) {
					myAdv.choice2(choice);
					String p = input.next();
					try {
						choice = Integer.parseInt(p);
					} catch(NumberFormatException e) {
						//no throw up :)
					}
					if(myAdv.getCounter() == 69) {
						System.out.println("\nWould you like to play again?");
						input.nextLine();
						String playAgain = input.nextLine();
						if(playAgain.toLowerCase().equals("yes")) {
							main(args);
						} else if(playAgain.toLowerCase().equals("no")) {
							System.exit(0);
						}
					}
				}
			} if(choice == 1 || choice == 2 || choice == 3) {
				myAdv.choice2(choice);
				System.out.println("\nWould you like to play again?");
				input.nextLine();
				String playAgain = input.nextLine();
				if(playAgain.toLowerCase().equals("yes")) {
					main(args);
				} else if(playAgain.toLowerCase().equals("no")) {
					System.exit(0);
				}
			}

		} else{
			System.out.println("Would you like to play again?");
		}

		input.close();
	}

}
