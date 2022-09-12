import java.util.Scanner;
public class Lab3Q6 {
    public static void main(String[] args) {
        int x,y,m;
        Scanner write=new Scanner(System.in);
        System.out.print("Enter Three Numbers ");
        x= write.nextInt();
        y= write.nextInt();
        m= write.nextInt();
        if (x<y && y<m){
            System.out.println("They're Increasing");
        }
        else if (x>y && y>m){
            System.out.println("They're Decreasing");
        }
        else {
            System.out.println("Neither");
        }}
}
