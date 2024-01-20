/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.Random;

public class Gen3 {
	public static void main(String[] args) {
		int lower = Integer.parseInt(args[0]);
		int upper = Integer.parseInt(args[1]);
		Random rand = new Random();
		int rand_int1 = rand.nextInt(lower, upper);
		System.out.println(rand_int1);
		int rand_int2 = rand.nextInt(lower, upper);
		System.out.println(rand_int2);
		int rand_int3 = rand.nextInt(lower, upper);
		System.out.println(rand_int3);
		int min = rand_int1;
		if (min > rand_int2) {
			min = rand_int2;
		}
		if (min > rand_int3) {
			min = rand_int3;
		}
		System.out.println("The minimal generated number was " + min);
	}
}
