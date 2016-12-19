/* Third programming assignment for MIT Opencourseware 6.092
 * Michael Le @ le.michael6@gmail.com
 * Marathon.java
 * This will return the fastest runner given their 
 * name and time. 
 * This assignment demonstrates use of arrays and loops.
 */

class Marathon {
	public static int getFastest(int[] times) {

		int fastest = Integer.MAX_VALUE;
		int nameIndex = -1;

		for (int i = 0; i < times.length; i++) {
			if (times[i] < fastest) {
				fastest = times[i];
				nameIndex = i;
			}
		}

		return nameIndex;
	}

	public static void main(String[] arguments) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James",
				"Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

		/*
		 * Prints name and their respective times. for (int i = 0; i <
		 * names.length; i++) { System.out.println(names[i] + ": " + times[i]);
		 * }
		 */

		System.out.println(names[getFastest(times)] + " is the fastest runner in the marathon. ");
	}
}