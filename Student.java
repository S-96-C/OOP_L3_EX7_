class Student extends Person{
	String studentID;
	
	public Student(String newName, String newAddress, String newstudentID){
		super(newName, newAddress);
		studentID = newstudentID;
		
	}
	void getDetails(){
		super.getDetails();
		System.out.println("MY ID is " + studentID);
	}
}
