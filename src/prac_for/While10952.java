package prac_for;

import java.util.Scanner;

/*A+B - 5
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
�Է��� ���������� 0 �� ���� ���´�.*/

public class While10952 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int userA;
		int userB; 
		
		
		while(true) {
			userA = sc.nextInt();
			userB = sc.nextInt();
			int sumAb = userA+userB;
			if(userA==0 && userB==0) {
				break;
			}
			System.out.println(sumAb); //�̰� if�� �ڿ� �;���.
		}
		
		
	}

}
