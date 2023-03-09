import java.util.Scanner;

public class rotatedlist {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, n1 = 0, n2 = 1;
		System.out.println("Enter the n value: ");
		n = sc.nextInt();
		int fibterm =0;
		if (n == 0 || n == 1)
			System.out.println(n);
		else
			fibterm= n1 + n2;
		for (int i = 3; i <= n; ++i) {
			n1= n2;
			n2 = fibterm;
			fibterm = n1 + n2;
		}
		System.out.println(n2);
	}
}