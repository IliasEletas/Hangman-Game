package Hangman;

public class Dictionary {
	
	public String getWord(int index) {
		switch (index) {
		case 0: return "UNIVERSITY";
		case 1: return "COMPUTER";
		case 2: return "LAPTOP";
		case 3: return "HEADPHONES";
		case 4: return "FUZZY";
		case 5: return "DOG";
		case 6: return "KEYHOLE";
		case 7: return "TELEPHONE";
		case 8: return "PRINTER";
		case 9: return "BUILDING";
		case 10: return "PHONE";
		case 11: return "WATER";
		case 12: return "FIRE";
		case 13: return "BOOK";
		case 14: return "NEWSPAPER";
		case 15: return "MONEY";
		case 16: return "MOTHER";
		case 17: return "CHAIR";
		case 18: return "WATCH";
		case 19: return "PUZZLE";
		default: return "Illegal index";
		}
		}; 
}
