package quizlet;
import java.util.Scanner;

public class quiz {
	static Scanner scanner = new Scanner(System.in);
	static int numOfMulChoice;
	static int numOfTF;
	static int numOfWriting;
	public static void studyFlashcards() {
		System.out.println("Out of the " + quizletRunner.numOfCards + " flashcards, how many cards do you want to be multiple choce questions?");
		System.out.println();
		numOfMulChoice = scanner.nextInt();
		System.out.println("How many cards do you want to be true or false?");
		System.out.println();
		numOfTF = scanner.nextInt();
		System.out.println("How many cards do you want to be writing?");
		System.out.println();
		numOfWriting = scanner.nextInt();
		if(numOfMulChoice + numOfTF + numOfWriting > quizletRunner.numOfCards) {
			System.out.println("You went over the amount of cards that you made, try again.");
			studyFlashcards();
		}
		
		if(numOfMulChoice > 0) {
			for(int i = 0; i <= numOfMulChoice; i++) {
				System.out.println(quizletRunner.Flashcards.get(i).getTerm());
				System.out.println("a." );
			}
		}
		if(numOfTF > 0) {
			
		}
		if(numOfWriting > 0) {
			
		}
	}
}
