import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Puntoa {
	private static BufferedReader in;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for (int i=0; i<t; i++) {
			String[] l = in.readLine().split(" ");
			int n = Integer.parseInt(l[0]);
			int H = Integer.parseInt(l[1]);
			l = in.readLine().split(" ");
			int[] a = new int[n];
			for (int j=0; j<n; j++) {
                a[j] = Integer.parseInt(l[j]);
			}     
			
	        Arrays.sort(a);
	        int b= a[n-1];
	        int c= a[n-2];
	
	        int op = ((H)/(b+c))*2;
	        int ans;
	       
	        if(H%(b+c)==0) {
	        	ans=op;
	        }else if(H%(b+c)<=b) {
	        	ans=op+1;
	        }else {
	        	ans=op+2;
	        }
	     
	        System.out.println(ans);
		}
	}             
}
