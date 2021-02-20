
public class Checker {

	//static makes it where you can't use it with an object
	static public void IsEven(int number) {
		boolean IsEven = false;
		if(number % 2 == 0) { //checks id the number is even
			IsEven = true;
			if(IsEven == true) {
				System.out.println("This is " + IsEven + " " + number + " is EVEN!");
			}
		}else {
			System.out.println("This is " + IsEven + " " + number + " is NOT EVEN!");
		}
	} //end of IsEven method
	
	static public void IsOdd(int number) {
		boolean IsOdd = false;
		if(number % 2 == 1) { //checks id the number is odd
			IsOdd = true;
			
			if(IsOdd == true) {
				System.out.println("This is " + IsOdd + " " + number + " is ODD!");
			}//end of inner if statement
			
		}else {
			System.out.println("This is " + IsOdd + " " + number + " is NOT ODD!");
		}
	}//end of IsOdd method
	
	static public void IsPrime(int number) {
		
		boolean IsPrime = false;
		if(IsPrime == false) {
			
			for(int n = 2; n < number;n++) {
				if( number <= 1 || number % n == 0 ) { //checks id the number is NOT prime
					IsPrime = false;
					System.out.println("This is " + IsPrime + " " + number + " is  NOT Prime!");
					break;
				}
				else{ //sets it as prime if the if statement conditions are false
					IsPrime = true;
					System.out.println("This is " + IsPrime + " " + number + " is Prime!");
				}//end of while loop
			}//end of for loop
		}
	}//end of IsPrime method
	
	public static void main(String[] args) {
	
		Checker.IsEven(8);
		Checker.IsOdd(8);
		Checker.IsPrime(8);
		System.out.println();
		
		Checker.IsEven(3);
		Checker.IsOdd(3);
		Checker.IsPrime(3);
		System.out.println();
		
		Checker.IsEven(30);
		Checker.IsOdd(30);
		Checker.IsPrime(30);
	}//end of main method
	
}//end of Checker method
