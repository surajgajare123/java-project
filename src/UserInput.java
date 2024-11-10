import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        System.out.println("Taking User Input !");
        System.out.println("Enter Your First Number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Your Second Number : ");
        int b = sc.nextInt();
        int Add = a + b;
        System.out.println("Addition Two Number Is : ");
        System.out.println(Add);

    }
}
