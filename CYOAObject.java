package cyoaGame;

public class CYOAObject {

	private int counter;
	private String name;

	public CYOAObject(String name) {
		counter = 0;
		this.name = name;
	}

	public void startGame(){
		System.out.println("You’re an adventurer named " + name + ", and you wake up one morning to find out that you’re a Dragonborn, and you’re the only"
				+ "\none that’s been discovered in over ten thousand years. You go wandering around Canada one day and discover a Lightsaber. What will you do?\n");
		System.out.println("Option 1: Pick up the lightsaber.\nOption 2: You leave the lightsaber alone\nOption 3: Use the “Unrelenting Force” shout on the lightsaber.\n"
				+ "Option 4: Call upon the late Jedi Master Qui-Gon Jinn’s force ghost");
	}

	public void choice1(int choice) {
		if(choice == 1) {
			System.out.println("You pick up the lightsaber and activate it. The activation scares you and you drop it, landing perfectly vertical with the blade toward the floor,"
					+ "\nleaving the lightsaber tearing through the layers of Earth, which eventually reaches the core, causing Earth to explode."
					+ "\nEverybody is dead, and you achieve the ‘Clumsy Fool ending’.");
		}else if(choice == 2) {
			System.out.println("You decide that it’s the best option to leave the lightsaber alone, since it could be the temporary place a Jedi"
					+ "\nin need is storing it. Before you’re a mile away from it, Darth Vader himself comes up to you from behind and stabs you in the back."
					+ "\nHe says to you, “You were a fool to not take that lightsaber and join the dark side.” You die and achieve the ‘He was not your father ending’");
		}else if(choice == 3) {
			System.out.println("You take one good look at the lightsaber, and with no hesitation, the words “Fus, RO DAH” come out of your mouth."
					+ "\nAn extremely powerful blast of wind leaves your mouth, sending the lightsaber flying."
					+ "\nUnknowingly to you, it hits Darth Vader in the head, killing him instantly due to the pure speed of the lightsaber. You continue along your way.\n");
		}else {
			System.out.println("You call upon the late Jedi Master’s force ghost, and he appears to tell you that you’re not cool enough for him."
					+ "\nYou feel so embarrassed that you literally explode on the spot. You achieve the ‘The force is weak with this one ending’.");
		}
	}

	public void prompt2() {
		System.out.println("You’ve successfully yet accidentally killed Darth Vader, and you walk up to his corpse to remove the lightsaber lodged in his skull."
				+ "\nYou’ve now obtained “Darth Vader’s Lightsaber”. You continue on your journey, and along the way you hear what sounds like"
				+ "\nsomebody far away screaming for help. What will you do?\n");
		System.out.println("Option 1: Go help.\nOption 2: Not my problem...\nOption 3: Go home\nOption 4: Do a backflip");
	}

	public void choice2(int choice) {
		String optionPrompt = "Option 1: Go help.\nOption 2: Not my problem...\nOption 3: Go home\nOption 4: Do a backflip";
		if(choice == 1) {
			System.out.println("As a fierce warrior and the Dragonborn, you decide to go help them. You run as fast as you can, and the closer you get,"
					+ "\nyou begin to notice that the thing screaming for help is not a human. You’ve encountered a skinwalker."
					+ "\nNo matter how hard you try to run it catches up to you. You try your best to fight back, but this creature is far too powerful for you."
					+ "\nEvery time you slice it with your lightsaber, it heals back together instantly. You aren’t able to defeat it."
					+ "\nYou’ve gotten the ‘Death by Skinwalker ending.’");
		} else if(choice == 2) {
			System.out.println("You ignore it and keep on your way, and on your journey you run into a noble hero, who hears the same screams that you do."
					+ "\nHe’s on his way to help and gives you a dirty glare and calls his friends to tell them all about you walking away instead of helping."
					+ "\nYou’ve lost all respect from the people, and achieve the ‘Hero? More like zero!!! Ending’");
		} else if(choice == 3) {
			System.out.println("You decide to turn back around and go home, because you’re not sure you’re cut out for this hero business."
					+ "\nOn your way back home, you’re hungry and decide to eat the berries off of a random plant. These berries are extremely poisonous and you die painfully."
					+ "\nYou’ve achieved the ‘Red baneberry ending’");
		} else if(choice == 4) {
			if(counter == 0) {
				System.out.println("You spontaneously do a backflip. Why did you choose this option??? Pick again.");
				System.out.println(optionPrompt);
			} else if(counter > 0 && counter < 69) {
				System.out.println("You did another backflip. Congratulations. Pick again.");
				System.out.println(optionPrompt);
			}
			counter++;
			if(counter == 69) {
				System.out.println("You’ve backflipped 69 times and achieved the ‘Nice ending’ You win.");
			}
		}
	}

	public int getCounter() {
		return counter;
	}

}
