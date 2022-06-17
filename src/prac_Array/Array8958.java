package prac_Array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*OX����
"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. 
���� ���, 10�� ������ ������ 3�� �ȴ�.
"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, 
���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.
�� �׽�Ʈ ���̽����� ������ ����Ѵ�.*/

public class Array8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// �׽�Ʈ ���̽��� ���� 
		int n = Integer.parseInt(br.readLine());
		String arr[] = new String[n];
		
		for(int i =0; i<n;i++) {
			arr[i]=br.readLine();
		}
		
		
		// �� �׽�Ʈ ���̽� ����, 0<t <80 ���ڿ� O,X��
		for(int i=0; i<n ;i++) {
			int count =0;
			int sum =0;
			for(int j=0;j<arr[i].length(); j++) {
				if(arr[i].charAt(j)=='O') {
					count++;
				}else {
					count =0;
				}
				sum+=count;
				}
			sb.append(sum).append('\n');
		}
		System.out.println(sb);
	}

}
