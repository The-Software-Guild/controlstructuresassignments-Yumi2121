
public class SwitchCaseTest {

	public static void main(String[] args) {
		char a = ' ';
		if (a == 0 || Character.isWhitespace(a)) {
			System.out.println("Please make sure a is not 0 or empty");
		} else {
		
			switch (a) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println( a + " is vowel.");
				break;
			default:
				System.out.println( a + " is consonant.");
			}
		
		}
	}

}
