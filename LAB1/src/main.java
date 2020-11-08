import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("Number of cars: ");
        Scanner console1 = new Scanner(System.in);
        int n = console1.nextInt();

        Autopark autopark = new Autopark();

        System.out.println("Choose cars: ");
        System.out.println("1. Cabriolet ");
        System.out.println("2. Minivan ");
        System.out.println("3. Sedan ");
        System.out.println("4. SUV ");
        System.out.println("5. Universal ");



        for(int i =0; i<n;i++)
        {
            Scanner console2 = new Scanner(System.in);
            int choice = console2.nextInt();
            autopark.menu(n, choice);
        }

        int choice1;

        do {
            System.out.println("MENU ");
            System.out.println("1. Count autopark cost ");
            System.out.println("2. Find car by speed ");
            System.out.println("3. Sort cars by fuel consumption ");

            Scanner console3 = new Scanner(System.in);
            choice1 = console3.nextInt();
            switch (choice1) {
                case 1:
                    System.out.println(autopark.countCost());
                    break;
                case 2:
                    System.out.println("Enter a: ");
                    Scanner console4 = new Scanner(System.in);
                    int a = console4.nextInt();
                    System.out.println("Enter b: ");
                    Scanner console5 = new Scanner(System.in);
                    int b = console5.nextInt();
                    String str = autopark.findSpeed(a, b);
                    System.out.println(str);
                    break;
                case 3:
                   String str1 = autopark.sort();
                   System.out.println(str1);
                    break;
                default:
                    break;
            }
        } while (choice1!=0);

    }
}
