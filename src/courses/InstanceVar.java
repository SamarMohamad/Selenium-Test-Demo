package courses;

public class InstanceVar {

	int age =25  ;
	 
	public void testInstanceVar()
	
	{
		int age = 30 ;
		
		System.out.println(" My name is samar and iam " + age + " years old ");
		
	}
	
	
 public void testInstanceSecVar()
	
	{
		
		System.out.println(" My name is samar and iam " + age + " years old ");
		
	}
	
		
	
	
	
	public static void main(String[] args) {

		InstanceVar instobj = new InstanceVar();
		
		instobj.testInstanceVar();
		instobj.testInstanceSecVar();
		
		
		
	}

}
