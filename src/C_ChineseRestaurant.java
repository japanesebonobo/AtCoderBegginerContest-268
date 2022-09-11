package src;
import java.util.*;

public class C_ChineseRestaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] P = new int[N];
        int[] scores = new int[N];
        
        for (int i = 0; i < P.length; i++) {
            P[i] = scanner.nextInt();
        }
        scanner.close();
        
        int ans = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                scores[(P[i]-i-1+N+j)%N]+=1;
            }
        }

        for (int i = 0; i < N; i++) {
            if(scores[i] > ans) {
                ans = scores[i];
            }
        }
                
        System.out.println(ans);
    }
}

