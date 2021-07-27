package UC1;

public class UC1 {
	public static void main(String[] args) {
		
		double empcheck=(Math.floor(Math.random()*10) %2);
        if (empcheck == 1){
        	System.out.println("Employee is present");
        }
        else {
        	System.out.println("Employee is absent");
        }
	
		
	}

}
