package src;
import java.util.*;

public class B_Prefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        String T = scanner.next();
        scanner.close();
        String ans = "No";

        int count = 0;
        char prefixArray[] = S.toCharArray();
        char stringArray[] = T.toCharArray();

        if(prefixArray.length > stringArray.length) {
            System.out.println(ans);
            System.exit(0);
        }

        for (int i = 0; i < prefixArray.length; i++) {
            if(prefixArray[i] == stringArray[i]) {
                count++;
            }
        }

        if(count == prefixArray.length) {
            ans = "Yes";
        }
        
        System.out.println(ans);
    }
}

