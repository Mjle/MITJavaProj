/* Second Programming Assignment from MIT OpenCourseware 6.092
 * Michael Le | le.michael6@gmail.com
 * FooCorporation
 * Method to print based on base pay and hours worked
 * Overtime: More than 40 hours, paid 1.5 times base pay
 * Minimum wage: $8/hr, Max hours: 60 hours/ week
 */
class FooCorporation {

	// Calculates income based on hours worked
	public static void incomeCalc(double hoursWorked, double wage){
		double overtime = 1.5;
		double pay;
		double overtimeHours = 0;
		//Calculates overtime hours
		if (hoursWorked > 40){
			overtimeHours = hoursWorked - 40;
			hoursWorked = 40;
		}
		//Calculates pay
		pay = wage * hoursWorked;
		pay += overtimeHours * wage * overtime;
		System.out.println("Your pay should be: "+pay);
	}
	
	public static void main(String[] args) {
		/* Change wage and hours worked respectively to 
		 * calculate how much you made considering > $8
		 * and < 60 hours of work.
		 */
		double wage = 0;
		double hoursWorked = 0;
		
		if (hoursWorked <= 60 && wage > 8){
			incomeCalc(hoursWorked, wage);
		}else{
			System.out.println("Wage should be over $8 and hours worked should be less than 60.");
		}
		
	}

}
