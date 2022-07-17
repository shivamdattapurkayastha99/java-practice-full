
public class T5 {
    // static int sum(int a,int b){
    //     return a+b;
    // }
    static int sum(int ...arr){
        int result=0;
        for (int a : arr) {
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Varargs tutorial");
        System.out.println(sum(4, 5));
        System.out.println(sum(4, 5,6));
    }
}
