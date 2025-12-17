import java.util.Scanner;
public class vowel_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ("aeiouAEIOU".indexOf(ch) != -1)
            System.out.println(ch + " is a Vowel");
        else
            System.out.println(ch + " is a Consonant");
        sc.close();

	}

}
