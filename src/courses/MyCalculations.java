package courses;

public class MyCalculations extends Calculations  {
	
	
	public void multiply ( int firsnum , int secondnum ) {
		
		total = firsnum * secondnum ;
		
		System.out.println(" the result of multiple numbers is  = " +  total );		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
     
		
		MyCalculations mycalc = new MyCalculations();
		
		mycalc.addition(3,5 );
        mycalc.subtraction(10,5 );
        mycalc.multiply(5, 5);
	}

}
