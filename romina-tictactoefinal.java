import java.util.*;
public class TicTacToe {
	
static boolean hasWon = false;
static char[][] board = new char[3][3];
	
public static void main (String [] args){
Scanner s = new Scanner (System.in);

		System.out.println("Welcome to Tic Tac Toe! You are player X, and player O is your opponent.");
		System.out.println("Make sure two people are playing.");
		System.out.println("You go first.");
	while (hasWon == false){
		System.out.println("Your turn.");
		System.out.println("Row: (1, 2, 3)");
		int row = s.nextInt();
		row--;
		System.out.println("Column: (1, 2, 3)");
		int column = s.nextInt();
		column--;
		if (board[row][column] == 0){
			board[row][column] = 'X';
		} 
		else if (board[row][column] != 0){
			System.out.println("ERROR DETECTED: You may not pick this row and column as it is taken.");
		}
		checkWin();
		
		
		System.out.println(" " + board[0][0] + " |" + " " + board[0][1] + " |" +  " " + board[0][2] + " ");
		System.out.println("- - - - - -");
		System.out.println(" " + board[1][0] + " |" + " " + board[1][1] + " |" + " " + board[1][2] + " ");
		System.out.println("- - - - - -");
		System.out.println(" " + board[2][0] + " |" + " " + board[2][1] + " |" +  " " + board[2][2] + " ");
			
		System.out.println("Now O's turn.");
		int row2 = s.nextInt();
		row2--;
		System.out.println("Column: (1, 2, 3)");
		int column2 = s.nextInt();
		column2--;
		board[row2][column2] = 'O';
		if (board[row][column] != 0){
			System.out.println("ERROR DETECTED: You may not pick this row and column as it is taken.");
		}
		
		
		checkWin();
		
		
		System.out.println(" " + board[0][0] + " |" + " " + board[0][1] + " |" +  " " + board[0][2] + " ");
		System.out.println("- - - - - -");
		System.out.println(" " + board[1][0] + " |" + " " + board[1][1] + " |" + " " + board[1][2] + " ");
		System.out.println("- - - - - -");
		System.out.println(" " + board[2][0] + " |" + " " + board[2][1] + " |" +  " " + board[2][2] + " ");
	}
}

static void checkWin() {
	//across top
			if (board[0][0] == board [0][1] && board[0][0] == board[0][2] && board[0][0] != 0){
				hasWon = true;
				System.out.println("Player " + board[0][0] + " won!");
			}
	//across middle
			if (board[1][0] == board [1][1] && board[1][0] == board[1][2] && board[1][0] != 0){
				hasWon = true;
				System.out.println("Player " + board[1][0] + " won!");
			}
	//across bottom
			if (board[2][0] == board [2][1] && board[2][0] == board[2][2] && board[2][0] != 0){
				hasWon = true;
				System.out.println("Player " + board[2][0] + " won!");
			}
	//vertical left
			if (board[0][0] == board [1][0] && board[0][0] == board[2][0] && board[0][0] != 0){
				hasWon = true;
				System.out.println("Player " + board[0][0] + " won!");
			}
	//vertical middle
			if (board[0][1] == board [1][1] && board[0][1] == board[2][1] && board[0][1] != 0){
				hasWon = true;
				System.out.println("Player " + board[0][1] + " won!");
			}
	//vertical right
			if (board[0][2] == board [1][2] && board[0][2] == board[2][2] && board[0][2] != 0){
				hasWon = true;
				System.out.println("Player " + board[0][2] + " won!");
			}
	//negative diagonal
			if (board[0][0] == board [1][1] && board[0][0] == board[2][2] && board[0][0] != 0){
				hasWon = true;
				System.out.println("Player " + board[0][0] + " won!");
			}
	//positive diagonal
			if (board[0][2] == board [1][1] && board[0][2] == board[2][0] && board[0][2] != 0){
				hasWon = true;
				System.out.println("Player " + board[0][2] + " won!");
			}
			if (board[0][0] != 0 && board[0][1] != 0 && board[0][2] != 0 && board[1][0] != 0 && board[1][1] != 0 && board[1][2] != 0 && board[2][0] != 0 && board[2][1] != 0 && board[2][2] != 0){
				System.out.println("Game over; no winner.");
			}
}
}
