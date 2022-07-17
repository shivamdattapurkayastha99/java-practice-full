
class MyMainEmployee{
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
    public MyMainEmployee(){
        id=45;
        name="Shivam";

    }
}
public class T9 {
    public static void main(String[] args) {
        MyMainEmployee shivam=new MyMainEmployee();
        // shivam.setName("Shivam");
        // shivam.getName();
        System.out.println(shivam.getId());
        System.out.println(shivam.getName());

    }
}
