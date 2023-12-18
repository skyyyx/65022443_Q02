import java.util.Arrays;

public class QuizOneJunit {
	
	private String firsTwotLetter,lastTwoLetter;
	private int count = 0;
	
	// 1. Square Area
	public int square(int x){
		return x*x;
	}
	// 2. Number of "a" and "A" letters
	public int countLetterA(String word){
		
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)=='a'|| word.charAt(i)=='A'){
				count++;
			}
		}
		return count;
	}
	//3. Two Letters are the same
	public boolean checkTwoLetter(String letter){
		
		if(letter.length()<=1){
			return false;
		}
		else if(letter.length()==2){
			return true;
		}
		firsTwotLetter = letter.substring(0,2);
		lastTwoLetter = letter.substring(letter.length()-2);
		
		return firsTwotLetter.equals(lastTwoLetter);	
	}

	public static void main(String[] args) {
        QuizOneJunit quiz = new QuizOneJunit();
		// 1
		int squareResult = quiz.square(85);
		System.out.println("Squaure of " + squareResult);
		// 2
		String word = "1234";
		int countA =quiz.countLetterA(word);
		System.out.println("Count a and A letters of "+word +" : "+ countA);
		// 3.1
		String firsttwoletters = "baba";
		boolean firstlettersSame = quiz.checkTwoLetter(firsttwoletters);
		System.out.println("The first and last letters in " + firsttwoletters + " is " + firstlettersSame);
		// 3.2
		String lasttwoletters = "99ut";
		boolean lasttwoLettersSame = quiz.checkTwoLetter(lasttwoletters);
		System.out.println("The first and last letters in " + lasttwoletters + " is " + lasttwoLettersSame);

    }
	
}