import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N:");
		int N=sc.nextInt();
		if(N<0||N>30) {
			System.out.println("Invalid Number enter!");
		}
		else {
		for(int i=0;i<N;i++) {
			int power=(int)Math.pow(2, i);
			System.out.println("2^"+i+"="+power);
		}
		}
		sc.close();

	}

}
