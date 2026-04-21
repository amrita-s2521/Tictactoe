package srm.com.java;
import java.util.Random;
	public class tictactoeUC2 {
	    static boolean isHumanTurn;
	    static char humanSymbol;
	    static char computerSymbol;

	    public static void main(String[] args) {
	        tossAndAssignSymbols();
	        displayTossResult();
	    }
	    static void tossAndAssignSymbols(){
	        Random random = new Random();
	        isHumanTurn = random.nextBoolean(); 
	        if (isHumanTurn) {
	            humanSymbol = 'X';
	            computerSymbol = 'O';
	        } else {
	            humanSymbol = 'O';
	            computerSymbol = 'X';
	        }
	    }
	    static void displayTossResult() {
	        System.out.println("Human goes first: " + isHumanTurn);
	        System.out.println("Human symbol: " + humanSymbol);
	        System.out.println("Computer symbol: " + computerSymbol);
	    }
}
