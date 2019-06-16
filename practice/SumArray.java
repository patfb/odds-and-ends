package practice;

import java.io.IOException;
import java.util.Arrays;

public class SumArray {

    static int simpleArraySum(int[] ar) {
        // int sum = 0;
        // for (int item : ar) {
        // sum += item;
        // }
        // return sum;
        return Arrays.stream(ar).sum();
    }

    // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        // int arCount = Integer.parseInt(scanner.nextLine().trim());

        // int[] ar = new int[arCount];

        // String[] arItems = scanner.nextLine().split(" ");

        // for (int arItr = 0; arItr < arCount; arItr++) {
        // int arItem = Integer.parseInt(arItems[arItr].trim());
        // ar[arItr] = arItem;
        // }

        int[] ar = { 1, 2, 3, 4, 10, 11 };

        int result = simpleArraySum(ar);

        System.out.println(result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();
    }
}
