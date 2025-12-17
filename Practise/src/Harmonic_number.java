import java.util.Scanner;
public class Harmonic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N:");
		int N =sc.nextInt();
		double sum=0.0;
		if(N==0) {
			System.out.print("No zero");
		}
		else {
			for(int i=1;i<=N;i++) {
				sum=sum+1.0/i;
			}
			
		}
		System.out.println(sum);
		sc.close();
	
	}

}
