import java.util.Scanner;

public class Package {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("What would you like to do?"+"\n"+"1. Calculate cost of one package"+"\n"+"2. Simulate packages"+"\n"+"3. How package costs are calculate"+"\n"+"4. Exit");
        System.out.print("Input: ");
        s.nextLine();
        Address one=new Address("1313 Mockingbird Lane fvujhbruhutghgru grey Apt 6A, Springfield, MO 65123");
        System.out.println(one.toString());

    }
}
