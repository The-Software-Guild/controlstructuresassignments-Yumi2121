
public class WhileLoop {

	public static void main(String[] args) {
		
			int num = 57;
			int reversedNum = 0;
			
			int originalNum = num;
			
			//get the reversed of num
			while (num != 0) {
				int remainder = num % 10;
				reversedNum = reversedNum*10 + remainder;
				num /= 10;	
			}
			
			// check if the num and reversedNum are the same
			if (originalNum == reversedNum) {
				System.out.println( originalNum + " is Palindrome.");
			} else {
				System.out.println(originalNum + " is not Palindrome.");
			}
	
	}

}
