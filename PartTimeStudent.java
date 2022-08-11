public class PartTimeStudent extends Student{
	int noOfHrs;
	
		public PartTimeStudent(String newName, String newAddress, String newstudentID, int newnoOfHrs){
			super(newName,newAddress,newstudentID);
			noOfHrs = newnoOfHrs;
		}	
		
		void getDetails(){
			super.getDetails();
			System.out.println("My working hours are " +noOfHrs);
		}
	
}