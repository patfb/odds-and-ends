package prep.practice;

import java.io.IOException;
import java.util.Arrays;

public class BigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long result;
        result = Arrays.stream(ar).sum();
        return result;
    }

    // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        // int arCount = scanner.nextInt();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // long[] ar = new long[arCount];

        // String[] arItems = scanner.nextLine().split(" ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // for (int i = 0; i < arCount; i++) {
        // long arItem = Long.parseLong(arItems[i]);
        // ar[i] = arItem;
        // }

        long[] array = { 1000000001, 1000000002, 1000000003, 1000000004, 1000000005 };

        long result = aVeryBigSum(array);

        System.out.println(result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        // scanner.close();
    }
}
