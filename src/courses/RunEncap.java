package courses;

public class RunEncap {

	public static void main(String[] args) {


		EncapTest Encap = new EncapTest();

		Encap.setAge(25);
		Encap.setidNum("11jhjh");
		Encap.setName("Samar");
		
		System.out.println(" My name is : "+ Encap.getName()+"  & Age is :" +  Encap.getAge() + " & ID is : "+ Encap.getIdNum());
	}

}
