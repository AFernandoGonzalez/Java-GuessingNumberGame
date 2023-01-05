import javax.swing.*;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randomNum = (int)(Math.random()*100 +1);
		int myGuess = 0;
		
		System.out.println("The correct answer is: " + randomNum);
		
		int count = 1;
		
		while(myGuess != randomNum) {
			String res = JOptionPane.showInputDialog(null, "Enter a guess between 1 - 100", "Guessing game" , 3);
			myGuess = Integer.parseInt(res);
			JOptionPane.showMessageDialog(null, "" + determineGuess(myGuess, randomNum, count));
			count++;
		}

	}
	
	public static String determineGuess(int myGuess, int randomNum, int count) {
		if( myGuess <=0 || myGuess >= 100) {
			return "Your guess is out of range";
		}
		else if(myGuess == randomNum) {
			return "You are correct, the correct number is " + count;
		}
		else if(myGuess < randomNum) {
			return "Your guess is to low" + count;
		}
		else if(myGuess > randomNum) {
			return "Your guess is to high" + count;
		}
		else {
			return "Your guess is incorrect, please try again: " + count;
		}
		
	}

}
