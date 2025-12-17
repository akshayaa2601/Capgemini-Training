import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int N = sc.nextInt();

        System.out.println("Prime factors:");

        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N = N / i;
            }
        }

        if (N > 1) {
            System.out.print(N); 
        }

        sc.close();

	}

}
