import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PuntoD {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(in.readLine());
		for (int i=0; i<t; i++) {
			solve();
		}
	}
	
	public static void solve() throws IOException {
		String[] l = in.readLine().split(" ");
		int a = Integer.parseInt(l[0]);
		int b = Integer.parseInt(l[1]);
		int temp = a<b? a : b;
		System.out.println((a+b)/4 < temp? (a+b)/4 : temp);		
	}
}
