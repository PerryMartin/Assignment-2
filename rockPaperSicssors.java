/****************************************************************************
 *
 * Created by: Perry Martin
 * Created on:  2016
 * Rock paper sicssors
 *
 ****************************************************************************/


import java.util.Scanner;
import java.util.Random;


class Rock {
	
    public static void main(String[] args) {
        
        Random rnd = new Random();
	 	int comNumber = rnd.nextInt(3) + 1;
        
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose rock(1), paper(2) or sicssors(3).");
		System.out.println("");
		int player = input.nextInt();
		
		
		// Chooses who Wins
		if ((comNumber == 1)&&(player == 2)) {
			System.out.println("Compter: Rock");
			System.out.println("You Win");
		} 
		 else if ((comNumber == 1)&&(player == 3)) {
			System.out.println("Computer: Rock");
			System.out.println("You Lose");
		} 
	     else if ((comNumber == 2)&&(player == 3)) {
			System.out.println("Computer: paper");
			System.out.println("You Win");
		} 
		 else if ((comNumber == 2)&&(player == 1)) {
			System.out.println("Computer: paper");
			System.out.println("You Lose");
		} 
		 else if ((comNumber == 3)&&(player == 1)) {
			System.out.println("Computer: sicssors");
			System.out.println("You Win");
		} 
		 else if ((comNumber == 3)&&(player == 2)) {
			System.out.println("Computer: sicssors");
			System.out.println("You Lose");
		} 
		else{
			System.out.println("You both picked the same thing");
			System.out.println("You Tie");
		} 
		
		
		//System.out.println(comNumber);
		

  }
}
