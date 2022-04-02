import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PuntoB {
	
	public static void main(String [] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.valueOf(in.readLine());
		String out = "";
		
		for(int i = 0;i<t;i++) {
			String[] l = in.readLine().split(" ");
			
			int length = Integer.valueOf(l[0]);
			int sum = Integer.valueOf(l[1]);

			int answer = sum/((length/2)+1);
			out += answer+"\n";
		}
		
		System.out.println(out);
	}
	
}
