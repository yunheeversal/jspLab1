package prac_fx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*�Ѽ�
� ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. 
N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.
ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.*/

public class fx1065 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println(hansu(Integer.parseInt(br.readLine())));
		
	}
	
	public static int hansu(int num) {
		int cnt =0;

		if(num<100) { // 100���� ���� �� �� �����̴ϱ� �� return
			return num;
		}else {
			cnt =99; // �Ѽ��� �ּ� ������ 99���ϱ�.
			
			for(int i =100; i<=num ; i++) {
				int hun = i/100; // ���� �ڸ�
				int ten = (i/10)%10; // ���� �ڸ�
				int one = i%10;// ���� �ڸ�
				
				if((hun-ten)==(ten-one)){// �� �ڸ����� ������ �̷�� ī��Ʈ
					cnt++;
				}
			}
			
		}
		
		return cnt;
	}

	
}
