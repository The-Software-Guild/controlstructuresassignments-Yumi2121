
public class DoWhileLoop {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 1;
		int n = 10;
		int i = 0;
		
		do {
			int fibonacci = firstNum + secondNum;
			
			firstNum = secondNum;
			secondNum = fibonacci;
			
			System.out.println(fibonacci);
			
			i++;
		} while (i <= n);

	}
}
