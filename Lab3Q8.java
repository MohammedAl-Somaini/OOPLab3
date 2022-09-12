import java.util.Scanner;

public class Lab3Q8 {
    public static void main(String[] args) {
        String name;
        double Salary,Hour,pay=0;
        Scanner write=new Scanner(System.in);
        System.out.println("What is Your Name? ");
        name=write.next();
        System.out.println("What is Your Salary? ");
        Salary=write.nextDouble();
        System.out.println("How many Hours Did You Work? ");
        Hour=write.nextDouble();
        if (Hour>40)
        {
            pay=((Hour-40)*(1.5*Salary)+(40*Salary));
        }
        else {
            pay=(Hour*Salary);
        }
        System.out.println("Your Name Is "+name);
        System.out.println("Your Salary Is "+Salary);
        System.out.println("The Hours That You Worked are "+Hour);
        System.out.println("Your Paycheck Is"+pay);
    }
}
