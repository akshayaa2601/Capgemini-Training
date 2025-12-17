import java.util.Scanner;
public class Heads_tails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of times to flip the coin: ");
        int n = sc.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        }

        int heads = 0;
        int tails = 0;

        for (int i = 0; i < n; i++) {

            double randomValue = Math.random();  // generates 0.0 to <1.0

            if (randomValue < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }

        double headsPercent = (heads * 100.0) / n;
        double tailsPercent = (tails * 100.0) / n;

        System.out.println("Total flips: " + n);
        System.out.println("Heads Count: " + heads);
        System.out.println("Tails Count: " + tails);
        System.out.println("Heads Percentage: " + headsPercent + "%");
        System.out.println("Tails Percentage: " + tailsPercent + "%");
        
        sc.close();

	}

}
