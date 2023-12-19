package courses;

public class TestSwitchCase {

	public static void main(String[] args) {
		int day = 7 ;

		switch (day) {
		case 1 : 

			System.out.println( " السبت هو اول ايام الاسبوع");

			break;

		case 2:
			System.out.println( " الاحد ثاني ايام الاسبوع ");
			break;


		case 3:
			System.out.println( " الاثنين ثالث ايام الاسبوع ");
			break;

		case 4:
			System.out.println( " الثلاثاء رابع يام الاسبوع ");
			break;
		case 5:
			System.out.println( " الاربعاء خامس ايام الاسبوع ");
			break;
		case 6:
			System.out.println( " الخميس سادس  ايام الاسبوع ");
			break;

		case 7:
			System.out.println( "يوم الجمعه اجازه معروفه اصلا   ");
			break;



		default:
			System.out.println(" قم باختيار يوم محدد " );
			break;
		}











	}

}
