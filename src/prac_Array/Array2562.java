package prac_Array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*�ִ�
9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ���, ���� �ٸ� 9���� �ڿ���
3, 29, 38, 12, 57, 74, 40, 85, 61
�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.
ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.*/
public class Array2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[9];
		
		for(int i=0;i<9;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			
		}
		
		int max =0;
		int index=0;
		int count =0;
		
		for(int value:arr) {
			count++;
			if(value > max) {
				max = value;
				index=count;
			}
		}
		System.out.println(max);
		System.out.println(index);
			
	}

}
