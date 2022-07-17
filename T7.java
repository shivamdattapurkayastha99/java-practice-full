
class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println(id);
        System.out.println(name);
    }
}
public class T7 {
   public static void main(String[] args) {
    System.out.println("custom class");
    Employee shivam=new Employee();
    shivam.id=12;
    shivam.name="Shivam";

    // System.out.println(shivam.id);
    // System.out.println(shivam.name);
    shivam.printDetails();
   } 
}
