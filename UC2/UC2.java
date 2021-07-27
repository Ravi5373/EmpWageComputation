package UC2;

public class UC2 {

	public static void main(String[] args) {
		
		// constant
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HRS =  20;
		
		//variables
		int empHrs = 0;
		int empWage = 0;
		
		// comparision
		double empcheck = (Math.floor(Math.random() *10)%2);
		
		if(empcheck == IS_FULL_TIME) {
			empHrs = 8;
		}
		else {
			empHrs = 4;
		}
		empWage = empHrs * EMP_RATE_PER_HRS;
		System.out.println("Empwage : "+empWage);
		

	}

}
