import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flats[][]=new int[2][2];

        String name="Shivam";
        int value=name.length();
        System.out.println(value);
        String lString=name.toLowerCase();
        System.out.println(lString);
        String uString=name.toUpperCase();
        System.out.println(uString);
        String nonTrimmedString="   Shivam  ";
        String TrimmedString=nonTrimmedString.trim();
        System.out.println(TrimmedString);
        int marks[]={98,45,97};
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
            
        }
        for (int ele : marks) {
            System.out.println(ele);
            
        }
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                flats[i][j]=sc.nextInt();

                
            }
        }
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.println(flats[i][j]);
                
                
            }
        }
    }
    
}
// ------------------Tut31-------------