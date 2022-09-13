import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {

		Scanner MyScanner = new Scanner(System.in);
		System.out.println("Rock(0) Scissor(1) Paper(2)");
		
		String input = MyScanner.nextLine();
		
		
		try {
		int userChoice = Integer.parseInt(input);
		
		if(userChoice > 3) {
			System.out.print("Invalid Input");
			}
		else {
				
				int computerChoice = (int) (Math.random() * 3);
				
				Check(computerChoice, userChoice);
			}
	}
		catch(Exception e) {
			System.out.println("Invalid Input");
		}

		

		
		
	}

	public static void Check(int computerChoice, int userChoice) {
		
		if(userChoice == 0) {
			System.out.println("You choose 'Rock'");
		}else if(userChoice == 1) {
			System.out.println("You choose 'Scissors'");
		}else {
			System.out.println("You choose 'Paper'");
		}
		
		if(computerChoice == 0) {
			System.out.println("Computer choose 'Rock'");
		}else if(computerChoice == 1) {
			System.out.println("Computer choose 'Scissors'");
		}else {
			System.out.println("Computer choose 'Paper'");
		}
		
		if(computerChoice == userChoice) {
			System.out.println("Draw");
		}
		else if(computerChoice == 0 && userChoice == 1){
			System.out.println("Computer wins!");
		}else if(computerChoice == 0 && userChoice == 2){
			System.out.println("User wins!");
		}else if(computerChoice == 1 && userChoice == 2){
			System.out.println("Computer wins!");
		}else if(computerChoice == 2 && userChoice == 0){
			System.out.println("Computer wins!");
		}else if(computerChoice == 2 && userChoice == 1){
			System.out.println("User wins!");
		}
	


	}
}