import java.util.Scanner;
public class Lab3Q7 {
    public static void main(String[] args) {
        int x,y,m;
        Scanner write=new Scanner(System.in);
        System.out.print("Enter Three Numbers ");
        x= write.nextInt();
        y= write.nextInt();
        m= write.nextInt();
        if (x>y && y>=m){
            System.out.println("In Order");
        }
        else if (x<y && y<=m){
            System.out.println("In Order");
        }
        else {
            System.out.println("Not In Order");
        }
    }
}
