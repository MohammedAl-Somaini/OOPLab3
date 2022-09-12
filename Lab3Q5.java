import java.util.Scanner;
import java.util.SortedMap;

public class Lab3Q5 {
    public static void main(String[] args) {
        int x,y,m;
        Scanner write=new Scanner(System.in);
        System.out.print("Enter Three Numbers ");
        x= write.nextInt();
        y= write.nextInt();
        m= write.nextInt();
        if (x==y && y==m && m==x){
            System.out.println("They're All are The Same");
        }
       else if (x!=y && y!=m && m!=x){
            System.out.println("They're All are different");
        }
        else {
            System.out.println("Neither");
        }}}
