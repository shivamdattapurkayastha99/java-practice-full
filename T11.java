
class Base1{
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    Base1(){
        System.out.println("constructor");
    }
    Base1(int x){
        System.out.println(x);
    }
}
class Derived1 extends Base1{
    public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    Derived1(){
        super(0);
        System.out.println("Derived constructor");
    }
    Derived1(int x,int y){
        // super(0);
        System.out.println(x+" "+y);
    }
}

public class T11 {
   public static void main(String[] args) {
        Base1 b=new Base1();
        Derived1 d=new Derived1();
        Derived1 d1=new Derived1(4,9);
   } 
}
// tut47