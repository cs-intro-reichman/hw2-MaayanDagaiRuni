// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
      int N = Integer.parseInt(args[0]);
      String mode = args[1];
	  int count = 0;
	  
	  for(int seed = 1; seed <= N ; seed ++){
            int current = seed;
            int steps = 1;	

		if (mode.equals("v")){
			System.out.print(current + " ");
			
		}
		while (current!= 1){
			if (current % 2 == 0){
				current = current / 2;
			}
			else{
				current = current * 3 + 1;
			}
			steps ++;

			if (mode.equals("v")){
				System.out.print(current + " ");
			}

		}
		            if (mode.equals("v")) {
                System.out.println("(" + steps + ")");
            }
			count++;
        }
	  
	  
	  System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");

	}
}
// Every one of the first 7 hailstone sequences reached 1.
// 5. Collatz Conjecture (30 Points)
// A hailstone sequence is created as follows: Start with some non-negative integer, let’s call it seed,
// and obtain a sequence of numbers as follows: (1) If the current number is even, divide it by 2;
// otherwise, multiply it by 3 and add 1; (2) Repeat.
// For example, here are the first 8 hailstone sequences (the first number in each sequence is the seed):
// Proposed implementation: Start by writing a loop that prints one hailstone sequence only, for a
// given seed value (N). Test the program for several such seed values. Next, nest this loop inside an
// outer loop that varies the seed from 1 to N. Finally, handle the verbose/concise requirement.