
public class BreakTest {
	
	public static boolean isPrime(int num) {
		for (int i =2; i< Math.sqrt(num)+1; i++) {
			if (num % i == 0) {
				return false;
			}	
		}	
		return true;
		
	}

	public static void main(String[] args) {
		
		int i= 2;
		int count = 0;
		
		while ( i >= 2) {
			if (isPrime(i))	
				System.out.println(i);
				i++;
		
			if (i > 100) {
				break;
			}
		}
		System.out.println("There are " + count + " prime number between 1-100");
	}
	


}


