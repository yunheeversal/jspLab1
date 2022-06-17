package prac_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. 
����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����,
�̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.*/

public class Array4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �׽�Ʈ ���̽��� ����
		int[] arr;
		
		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		// �л� �� �Է�
		for(int i =0; i<testCase; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			int N = Integer.parseInt(st.nextToken());
			arr = new int[N];
			double sum=0;
			
			// ���� �Է�
			for(int j = 0; j<N;j++) {
				int score= Integer.parseInt(st.nextToken());
				arr[j]=score;
				sum += score;
			}
			
			double avg =( sum / N);
			double count = 0;
			
			// ��� �Ѵ� �л� ����
			for(int j = 0;j<N;j++) {
				if(arr[j]>avg) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
		
	}

}
