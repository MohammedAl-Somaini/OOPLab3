import java.util.Scanner;

public class Lab3Q3 {
    public static void main(String[] args) {
        int x;
        Scanner write=new Scanner(System.in);
        System.out.print("Enter A Number To Know Either It's + or _ or 0 ");
        x=write.nextInt();
        if(x>0)
            System.out.println("It's a Positive Number");
        else if (x<0)
            System.out.println("It's a Negative Number");
        else
            System.out.println("It's Zero");
    }
}
