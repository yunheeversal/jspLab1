package prac_for;

import java.util.Scanner;

/*A+B - 4
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10) */

public class While10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		while(sc.hasNextInt()) { // NoSuchElement ����: �������� �ʴ� ���� ���������� �� �� �߻��մϴ�. sc.hasNextInt()�� �̿��ؼ� �ذ� 
			 a = sc.nextInt();
			 b = sc.nextInt();
			 int c = a+b;
			 if(a<=0 || b>=10) {
				 break;
			 }
			 
			 System.out.println(c);
			
		}
		
	}

}
