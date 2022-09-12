import java.util.Scanner;
public class Lab3Q4 {
    public static void main(String[] args) {
        int x;
        Scanner write=new Scanner(System.in);
        System.out.print("Enter A Number ");
        x=write.nextInt();
        if (x<0){
            x*=-1;
            System.out.println(x);
                }
        if (x<10 && x>=0){
            System.out.println("It's One Digit");
                }
      else if (x<100 && x>=10){
            System.out.println("They're Two Digits");
                }
      else if (x<1000 && x>=100){
            System.out.println("They're Three Digits");
                }
      else if (x<10000 && x>=1000){
            System.out.println("They're Four Digits");
                }
      else if (x<100000 && x>=10000){
            System.out.println("They're Five Digits");
                }
      else if (x<1000000 && x>=100000){
            System.out.println("They're Six Digits");
                }
      else if (x<10000000 && x>=1000000){
            System.out.println("They're Seven Digits");
                }
      else if (x<100000000 && x>=10000000){
            System.out.println("They're Eight Digits");
                }
      else if (x<1000000000 && x>=100000000){
            System.out.println("They're Nine Digits");
                }}}