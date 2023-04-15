import java.util.Scanner;
public class testcode6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("항목\t점수");
		int[] ar = { 1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6, 10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 7, 5, 6, 6, 5, 6, 7, 5, 6, 4, 8, 6, 8, 10, 6};
		int[] p =new int[ar.length];
		for (int i=0;i<ar.length;i++) {
			p[ar[i]]++;
		}
		for (int i=0;i<10;i++)
			System.out.printf("%d\t%d\n",i,p[i]);
		in.close();	
	}
	
}
