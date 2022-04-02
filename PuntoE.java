import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PuntoE {
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String [] args) throws IOException{
		int t = Integer.valueOf(in.readLine());
		for (int i=0; i<t; i++) {
			solve();
		}
	}
	
	public static void solve() throws IOException{
		String[] l = in.readLine().split(" ");
		int A = Integer.parseInt(l[0]);
		int B = Integer.parseInt(l[1]);
		int C = Integer.parseInt(l[2]);
		int K = Integer.parseInt(l[3]);
		System.out.println();
		int s1 = 0;
		int s2 = 100000;
		int ans = 0;
		while(s1<=s2) {
            int m = (s1+s2)/2;
            int v = (int) (A*(Math.pow(m, 2)) + B*m + C);
            if(v >= K){
                ans = m;
                s2 = m-1;
            }
            else
            	s1 = m+1;
        }
		
        System.out.println(ans);
	}
}
