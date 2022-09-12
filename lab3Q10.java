import java.util.Scanner;

public class lab3Q10 {
    public static void main(String[] args) {
        int Month;
        Scanner write=new Scanner(System.in);
        System.out.println("Enter The Number Of Month Such As 1 for january 2 for Feb..and So on");
        Month=write.nextInt();
        switch (Month){
            case 1:
                System.out.println("31 Days"); break;
            case 2:
                System.out.println("28 Days"); break;
            case 3:
                System.out.println("30 Days"); break;
            case 4:
                System.out.println("31 Days"); break;
            case 5:
                System.out.println("30 Days"); break;
            case 6:
                System.out.println("31 Days"); break;
            case 7:
                System.out.println("30 Days"); break;
            case 8:
                System.out.println("31 Days"); break;
            case 9:
                System.out.println("30 Days"); break;
            case 10:
                System.out.println("31 Days"); break;
            case 11:
                System.out.println("30 Days"); break;
            case 12:
                System.out.println("31 Days"); break;
            default:
                System.out.println("Enetr A Number From 1 To 12 Only"); break;
        }
    }
}
