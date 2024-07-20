import java. util.Scanner;


public class converter {

    public static void main(String[] args) {
        System.out.println("1 Ruppe");
        System.out.println("2 Dollar");
        System.out.println("3 Riyal");
     
        Scanner sc = new Scanner(System.in);
        System. out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
      
        switch (choice) {
            case 1:
                Ruppe_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

public static void Ruppe_to_other(double amt) {
    System.out.println("1 Ruppe = " + 0.013 + " Dollar");
    System.out.println();

    System.out.println(amt+" Ruppe = " + (amt * 0.013) + " Dollar");
    System.out.println();

    System.out.println("1 Ruppe = " + 0.045 + " Riya;");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt * 0.045) + " Riyal");
    System.out.println();

}
    

public static void Dollar_to_other(double amt) {
    System.out.println("1 Dollar = " + 79.37 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Dollar = " + (amt*79.37) + " Ruppe");
    System.out.println();

    System.out.println("1 Dollar= " + 3.75 + " Riyal");
    System.out.println();

    System.out.println(amt+" Dollar = " + (amt * 3.75) + " Riyal");
}

    

public static void Euro_to_other(double amt){
    System.out.println("1 Riyal = " + 22.32 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Riyal = " + (amt * 22.32) + " Ruppe");
    System.out.println();

    System.out.println(" 1 Riyal = " + 027 + " Dollar");
    System.out.println();

    System.out.println(amt+" Euro = " + (amt * 0.27) + " Dollar");
}
}

