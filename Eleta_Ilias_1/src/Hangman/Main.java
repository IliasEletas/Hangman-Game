package Hangman;

import java.util.Scanner;


public class Main {
	

	
	public static void main(String[] args) {
		
		Dictionary random_word = new Dictionary();
		Scanner mainMenuChoice = new Scanner(System.in);
		int i;
		int life = 8;
		int sum_Games = 0 ;
		int sumWonGames = 0;
		int sumLostGames = 0;
		String Hangman_word ;
		
		
		while(true)
		{
			while(true)
			{
				i = (int)(Math.random()*100);
				if(i >=0 && i <=19)
				{	
				    Hangman_word=random_word.getWord(i);
					break;
				}
				
			}
			
			System.out.println("MAIN MENU");
			System.out.println("  - Start a new Game (N)");
			System.out.println("  - Statistics (S)");
			System.out.println("  - Exit (E)");
			System.out.print("Please enter your choice: ");   
			char screenIndex = mainMenuChoice.next().charAt(0);
		
			if (Character.toUpperCase(screenIndex) =='N')
			{
				sum_Games ++;
				if(guess(Hangman_word,life) == 1) 
				{
					sumWonGames ++;
				}
					else
					{
						sumLostGames ++;
					}
		
			}
				else if(Character.toUpperCase(screenIndex) == 'S')
				{
				if(sum_Games == 1 )
				{
					if(sumWonGames == 1 && sumLostGames == 1)
						System.out.println("You have played so far "+ sum_Games + " game. You won "+ sumWonGames +" time and lost "+ sumLostGames +" time.");
					else if(sumWonGames == 1)
						System.out.println("You have played so far "+ sum_Games + " game. You won "+ sumWonGames +" time and lost "+ sumLostGames +" times.");
					else if(sumLostGames == 1)
						System.out.println("You have played so far "+ sum_Games + " game. You won "+ sumWonGames +" times and lost "+ sumLostGames +" time.");
				 	else 
				 		System.out.println("You have played so far "+ sum_Games + " game. You won "+ sumWonGames +" times and lost "+ sumLostGames +" times.");
						
					
				}
				else 
					{
					if(sumWonGames == 1 && sumLostGames == 1)
						System.out.println("You have played so far "+ sum_Games + " games. You won "+ sumWonGames +" time and lost "+ sumLostGames +" time.");
					else if(sumWonGames == 1)
						System.out.println("You have played so far "+ sum_Games + " games. You won "+ sumWonGames +" time and lost "+ sumLostGames +" times.");
					else if(sumLostGames == 1)
						System.out.println("You have played so far "+ sum_Games + " games. You won "+ sumWonGames +" times and lost "+ sumLostGames +" time.");
				 	else 
				 		System.out.println("You have played so far "+ sum_Games + " games. You won "+ sumWonGames +" times and lost "+ sumLostGames +" times.");
						
					
					}
				
				}
					else if(Character.toUpperCase(screenIndex) =='E')
					{
						System.exit(0);
					}
		}
	}
	
	
	

	
	
	
	 public static int guess(String Hangman_word, int life)
	{
		 
		char[] filler = new char[Hangman_word.length()];
		int i = 0;
		while(i<Hangman_word.length())
		{
			filler[i]= '-';
			if(Hangman_word.charAt(i)==' ')
				filler[i]=' ';
			i++;
		}
		Scanner s = new Scanner(System.in);
		
		int Wrong_sum = 0; //wrong answers sum
		int Corr_sum = 0; // correct answers sum
		
		while(life>0)
			{
				
			System.out.print("The random word is now: ");
			System.out.println(filler);
			System.out.println("You have " + life +" guesses left.");
			System.out.print("Your guess: ");
			
			char x = s.next().charAt(0); //the word that i'm guessing
			x = Character.toUpperCase(x);
			
			if(Hangman_word.contains(x +""))
			{
				for(int y=0;y<Hangman_word.length();y++)
				{
					if(Hangman_word.charAt(y)==x)
					{
						filler[y]=x;
						System.out.println("The guess is CORRECT!");
						Corr_sum++;
					}
				}
			}
			else
			{
				System.out.println("There are no "+ x +"'s in the word.");
				life--;
				Wrong_sum++;
  				
			}
	
					
		if(Hangman_word.equals(String.valueOf(filler)))
		{
			System.out.print("Congratulations! You guessed the word: ");
			System.out.println(filler);
			System.out.println("You made "+ Corr_sum +" correct guesses and "+ Wrong_sum +" wrong guesses.");
			return 1;
		}
		if(life == 0)
		{
			System.out.println("You lose");
			   return 0;
		}		
				
			}
		
		return 0;
	}
	
}
