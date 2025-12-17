import java.util.Scanner;
public class Largest_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int largest;

        if (a >= b && a >= c)
            largest = a;
        else if (b >= a && b >= c)
            largest = b;
        else
            largest = c;

        System.out.println("Largest Number = " + largest);
		// TODO Auto-generated method stub
        sc.close();
	}

}
