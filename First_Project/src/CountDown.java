
public class CountDown {

	public static void main(String[] args) {
		//Simple For Loop
		System.out.println("Lift-off in ");
		for (int shuttle1 = 10; shuttle1 >= 1; shuttle1--) {
			System.out.println(shuttle1 + "... ");
		}
		System.out.println("Blast Off!");
		//Simple For Loop
		
		//Iterate an array with For Loop
		System.out.println("Students pass with a...");
		int arr[]= {82, 76, 91, 100};
		for(int grade=0; grade<arr.length; grade++) {
			System.out.println(arr[grade] + "%");
		}
		//Iterate an array with For Loop
		
		//Iterate an array with Enhanced For Loop
		System.out.println("In a survey, the 10 most common first words for babies include ");
		String array[]= {"dada", "mommy", "hi", "buba", "doggy", "ball", "no", "kitty", "nana", "bye"};
		for (String firstWord : array) {
			System.out.println(firstWord);
		}
		//Iterate an array with Enhanced For Loop
		
		//Iterating with While Loop
		int ar[]= {5, 11, 45, 22, 100, 34, 2, 6, 9};
		int i=0;
		while(i<4) {
			System.out.println(ar[i]);
			i++;
		}
		//Iterating with While Loop
		
		
		//Do-While Loop
		int mph = 1;
		do {
					System.out.println("Person walking at " + mph + "mph.");
					mph++;
		}while(mph>0 && mph<5);
		do {
			System.out.println("Person running at " + mph + "mph.");
			mph++;
		}while(mph>=5 && mph<18);
		}
	//Do-While Loop

	}

