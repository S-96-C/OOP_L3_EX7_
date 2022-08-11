public class Main {
  public static void main(String[] args) {
    Person p1 = new Person("Amal", "Ratnapura");
    p1.getDetails();
    Student s1 = new Student("Amal", "Ratnapura", "IT2285"+"\n");
    s1.getDetails();
    PartTimeStudent pts1 = new PartTimeStudent("Kamal", "Galle", "IT2005", 2);
    pts1.getDetails();
  }
}
