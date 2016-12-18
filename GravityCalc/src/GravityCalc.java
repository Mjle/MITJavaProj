/* First Programming Assignment from MIT OpenCourseware 6.092
 * Michael Le | le.michael6@gmail.com
 * Finds the final position of the object given
 * initial position, initial velocity, and falling time.
 * x(t) = 0.5 * at^2 + v[initial]t + x[initial]
 */

class GravityCalc {
	public static void main(String[] arguments) {
		double gravity = -9.81;  // Earth's gravity in m/s^2
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.5 * gravity
				* fallingTime * fallingTime;
		finalPosition += initialVelocity * fallingTime;
		finalPosition += initialPosition;
		System.out.println("The object's position after " + fallingTime +
				" seconds is " + finalPosition + " m.");
	}
}
