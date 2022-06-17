package prac_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArrayTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int testCase = Integer.parseInt(br.readLine());
        int[] arr = new int[testCase];
        st = new StringTokenizer(br.readLine());
        
        for(int i =0; i<testCase;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        sb.append(arr[0]).append(" ").append(arr[testCase-1]);
        
        System.out.println(sb);
		
	}

}
