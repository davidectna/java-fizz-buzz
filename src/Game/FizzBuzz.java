package Game;

public class FizzBuzz {
    public static void main(String[] args) {
    	String multipleFive = "Buzz"; 
    	String multipleThree = "Fizz";
    	String multipleThreeAndFive = "FizzBuzz";
    	
    	
    	for (int i = 1; i <= 100 ; i++) {
   
    		if(i % 3 == 0 && i % 5 == 0)  
    			System.out.println(multipleThreeAndFive);
    		else if (i % 3 == 0)
    			System.out.println(multipleThree);
    		else if (i % 5 == 0)
    			System.out.println(multipleFive);
    		else System.out.println(i);
    	}
	}
}
