
public class JavaLoopNotes {

	public static void main(String[] args) {
		int one = 15;
		int two;
		
		two = (one == 7) ? 2: 10;
		System.out.println("Bill is " + one + " and Timmy is " + two + ".");
		
		two = (one == 15) ? 14: 12;
		System.out.println("Susan is " + one + " and Lizy is " + two + ".");
	//Above is a Ternary Operator, ? True: False;
		
		
	//Personality Test Results
		int S;
		int N;
		
		S = 2;
		N = 3;
		
		if (S >= 3 && N <= 3) {
			System.out.println("S: You primarily rely on your senses and evidence to understand the world.");
			int J;
			int P;
			J = 4;
			P = 1;

			if (J >= 3 && P <=3) {
				System.out.println("J: Others in your family and at work see you as organized, responsible, and reiable.");
				System.out.println("Personality Type: SJ");
			}
				else {
					System.out.println("P: Your coworkers and family look to you to improvise when things don't go according to plan.");
					System.out.println("Personality Type: SP");
				}
			}
			else {
				System.out.println("N: You often rely on your insticts, the theoretical, and gut feelings to better undersand the world.");
				int F;
				int T;
				T = 3;
				F = 2;

				if (F >= 3 && T <= 3) {
					System.out.println("F: You care deeply for others. There is a personal obligation to compassion and morality within you.");
					System.out.println("Personality Type: NF");
				}
				else {
					System.out.println("T: You like to make decisions with your mind, not your heart. Rationality and truth are more important than harmony");
					System.out.println("Personality Type: NT");
				}
			}
		int people;
		
		people = 4;
		
		switch (people) {
		case 1:
			System.out.println("This is a single person household.");
			break;
		case 2:
			System.out.println("A married couple lives in this house.");
			break;
		case 3:
			System.out.println("A family with one child lives in this house.");
			break;
		case 4:
			System.out.println("A family with two children live in this house.");
			break;
		case 6: 
			System.out.print("This is a multi-generational household with two grndparents, two parents, and two children");
			break;
		}
	}
}
/*Java Arithmetic PEMDAS order:
 * 1. Unary Operators (++, --, !, ~)
 * 2. Multiplicative (*, /, %)
 * 3. Additive (+, -)
 * 4. Shift (<<, >>, >>>)
 * 5. Relational (>, >=, <, <=)
 * 6. Equality (==, !=)
 * 7. Bitwise AND, XOR, OR (&, ^, |)
 * 8. Logical AND, OR (&&, ||)
 * 9. Ternary Operator (? : ;)
 * 10. Assignment (=, +=, -=, *=, /=, >, >=, <, <=, &=, ^=, |=)
 * 
 * 
 */
