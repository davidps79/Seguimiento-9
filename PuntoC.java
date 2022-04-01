import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PuntoC{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String input = br.readLine();		
		String [] s = input.split(" ");		
		int n = Integer.valueOf(s[0]);		
		int k = Integer.valueOf(s[1]);	
		int out = 0;		
		int totalMinutes = 240-k;		
		boolean flag = false;		
		int sumMinutes = 0;
		
		for (int i = 0; i < n && !flag; i++) {
			sumMinutes += 5*(i+1);			
			if(sumMinutes > totalMinutes) {
				flag = true;
			}
			else {
				out ++;
			}
		}
		
		System.out.println(out);		
	}
}
