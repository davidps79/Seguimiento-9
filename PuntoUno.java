import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PuntoUno {
	private static BufferedReader in;
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		while ((input = in.readLine())!=null && !input.isEmpty()) {
			int N = Integer.parseInt(input);
			String[] line = in.readLine().split(" ");
			int[] numbers = new int[N];
			for (int i=0; i<N; i++) {
				numbers[i] = Integer.parseInt(line[i]);
			}
			
			int p = Integer.parseInt(in.readLine()); 
			Arrays.sort(numbers);
			
			int start = p%2==0? p/2 : p/2+1;
			int index1 = -1;
			int index2 = -1;
			for (int i=start; i>-1; i--) {
				index1 = binarySearch(numbers, N, i);
				if (index1!=-1) {
					index2 = binarySearch(numbers, N, p-numbers[index1]);
					if (index2!=-1) {
						System.out.println("Peter should buy books whose prices are " + numbers[index1] + " and " + numbers[index2] + ".\n");
						break;
					}
				}
			}
			
			in.readLine();
		}
	}
	
	public static int binarySearch(int arr[], int n, int k){
        int init=0;
        int fin=n-1;
        
        while(init <= fin){
            int mid= (init+fin)/2;
       
            if(arr[mid]==k){         
                return mid;
            } else if(arr[mid]>k){
                fin=mid-1;
            } else if(arr[mid]<k){
                init= mid+1;
            }
        }
        return -1;
        
    }
}
