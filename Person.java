public class Person{
	String name, address;
	
	//parameterized constructor
	public Person(String newName, String newAddress){
		name = newName;
		address = newAddress;
	}	
	
	void getDetails(){
		System.out.println("My name is " + name + "\nI am from " + address +"\n");
	}
	

}
