package prac_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/*������ 
�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. 
�� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. 
�� ���ڴ� 1,000���� �۰ų� ����, ���� �ƴ� �����̴�.
ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.*/

public class Array3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/* int[] arr = new int[10]; */
		HashSet<Integer> h = new HashSet<Integer>();	

		for (int i = 0; i < 10; i++) {
			h.add(Integer.parseInt(br.readLine()) % 42);
		}

		System.out.print(h.size());

	}

}
