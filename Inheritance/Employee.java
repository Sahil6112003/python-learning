import java.util.Scanner;

public class Employee {
    protected int mobile, id;
    protected String name, address, mail;
    protected double pay;
    protected Scanner get = new Scanner(System.in);
    
    public Employee() {
        System.out.println("Enter Name of the Employee:");
        name = get.nextLine();
        System.out.println("Enter mail id of employee: ");
        mail = get.nextLine();
        System.out.println("Enter address of employee: ");
        address = get.nextLine();
        System.out.println("Enter id of the Employee:");
        id = get.nextInt();
        System.out.println("Enter Pay:");
        pay = get.nextInt();

    }
}