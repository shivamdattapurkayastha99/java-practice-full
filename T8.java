import java.util.Scanner;
class MyEmployee{
    private int id;
    private String name;
    public void setName(String n){
        name=n;

    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;

    }
    public int getId(){
        return id;
    }
}
public class T8 {
    public static void main(String[] args) {
        MyEmployee shivam=new MyEmployee();
        // shivam.id=10;
        // shivam.name="Shivam";
        shivam.setId(2);
        shivam.setName("Shivam");
        System.out.println(shivam.getId());
        System.out.println(shivam.getName());
        

    }
}
// --------------------Tut-42 Constructors in java--------------->