package maximum_sum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tc = Integer.parseInt(s.nextLine());
		
		for(;tc>0;tc--) {
			String t = s.nextLine();
			int n = Integer.parseInt(t.split(" ")[0]);
			int arr[] = new int[n], data[] = new int[n];
			int subn = Integer.parseInt(t.split(" ")[1]);
			int sub[][] = new int[subn][2];
			
			t = s.nextLine();
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(t.split(" ")[i]);
				data[i] = arr[i];
			}
			
			for(int i=0; i<subn; i++) {
				t = s.nextLine();
				sub[i][0] = Integer.parseInt(t.split(" ")[0]);
				sub[i][1] = Integer.parseInt(t.split(" ")[1]);
			}
			
			int[] rank = new int[n];
			for(int i=0; i<subn; i++) {
				for(int j=sub[i][0]-1; j<sub[i][1]; j++) {
					rank[j]++;
				}
			}

			Arrays.sort(arr);
			int[] res = new int[n];
			int pos = 0;
			for(int j=0; j<n; j++) {
				int max = -1;
				for(int i=0; i<n; i++) {
					if(max < rank[i]) {
						max = rank[i];
						pos = i;
					}
				}
				res[pos] = arr[n-1-j];
				rank[pos] = -1;
			}

			/*
			for(int num : data)
				System.out.print(num + " ");
			System.out.println();
			for(int num : res)
				System.out.print(num + " ");
			System.out.println();
			*/
			
			int sumBob = sum(res, sub);
			int sumAlice = sum(data, sub);
			
			System.out.println(sumBob-sumAlice);
		}
	}
	
	public static int sum(int[] arr, int sub[][]) {
		int sum =0;
		for(int i=0; i<sub.length; i++) {
			for(int j=sub[i][0]-1; j<sub[i][1]; j++) {
				sum += arr[j];
			}
		}		
		return sum;
	}
}
