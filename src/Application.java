import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		// Create Scanner
		Scanner scan = new Scanner(System.in);
		//Created input for name
		System.out.print("Welcome:  What is your name? ");
		String name = scan.nextLine();

		System.out.print("\nWould you like to play a game? (yes or no) ");
		String firstChoice = scan.nextLine();
		//
		
		if (firstChoice.equalsIgnoreCase("No")) {
				System.out.println("Ok " + name + ", Maybe next time. ");
		}

		else if (firstChoice.equalsIgnoreCase("yes")) {
			System.out.println("Ok " + name + ", Let's play!! You are walking down the street and you noticed your neighbor's door open. Do you go inside or keep walking? ( Enter inside or walk away)");
		} 
		
		else {
				System.out.println("try again");
		}
			
		String secondChoice = scan.nextLine();

		if (secondChoice.equalsIgnoreCase("walk away")) {
			System.out.println("Well that's no fun.  I guess you will never no what happens.");
			scan.close();
			return;
		} 
		else if (secondChoice.equalsIgnoreCase("inside")) {
			System.out.println("You walk in the door and see that everything is a mess.  You do hear some noise in the basement.  You see a number of items that you could use to protect yourself with. Choose one. (flashlight, butterknife or fly swatter) ");
		}

		String thirdChoice = scan.nextLine();
		
		if (thirdChoice.equalsIgnoreCase("flashlight")){
			System.out.println("As you are slowly walking down the steps, you turn the flashlight on. However, the flashlight was upside down blinding yourself.  You fall down the steps and never find out what happens. ");
		}
		else if(thirdChoice.equals("butterknife")){
			System.out.println("You slowly walk down the steps with the butterknife in hand.  As you get to the buttom of the stairs you notice your neighbor franticly looking for something.  What is he looking for? (teeth, car keys).");
				String fourthChoice = scan .nextLine();
				
		if (fourthChoice.equalsIgnoreCase("teeth")){
					System.out.println("Yikes, teeth?  will you help him find them? (yes or no)");
					}
					String fifthChoice = scan.nextLine();
			
					if(fifthChoice.equalsIgnoreCase("yes")){
						System.out.println("You are brave!!  Good Luck I am out here.");
					}
					else if(fifthChoice.equalsIgnoreCase("No")){
						System.out.println("I agree.  You might want to make a run for it!");
					}
		}
		
		else if (thirdChoice.equalsIgnoreCase("fly swatter")){
				System.out.println("With fly swatter in hand. You run down the stairs and you see you neighbor frantickly looking for something.  What is he looking for? (teeth, car keys)");
				}
				String sixChoice = scan.nextLine();
		
				if (sixChoice.equalsIgnoreCase("teeth")) {
				System.out.println("Yikes, teeth?  will you help him find them? (yes or no)");
				String seventhChoice = scan.nextLine();
			
				if(seventhChoice.equalsIgnoreCase("yes")){
				System.out.println("You are brave!!  Good Luck I am outta here.");
				}
				else if(seventhChoice.equalsIgnoreCase("No")){
				System.out.println("I agree.  You might want to make a run for it!");
				}
			
		if ( sixChoice.equalsIgnoreCase("Car Keys")){
			System.out.println("Yea we have all been there. Will you help him find his keys. (yes or no");
			}
			String eightChoice = scan.nextLine();
			
			if(eightChoice.equalsIgnoreCase("yes")){
				System.out.println("You help your neighbor find his keys.");
			}
			else if(eightChoice.equalsIgnoreCase("No")){
				System.out.println("Your neighborhoood kicks you out of his house");
			}
				
		}
		scan.close();
	}
}
