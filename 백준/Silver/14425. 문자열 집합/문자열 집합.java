import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		Set<String> S = new HashSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		for(int i=0; i<N; i++) {
			S.add(br.readLine());
		}

		for(int i=0; i<M; i++) {
			if(S.contains(br.readLine())) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
