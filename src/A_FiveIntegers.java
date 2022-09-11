package src;
import java.util.Arrays;
import java.util.Scanner;

public class A_FiveIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        
        int ans = 1;

        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i] != numbers[i+1]) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}

