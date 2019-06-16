package prep;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HourGlass {

    public static final int GRID_SIZE = 6;

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        List<Integer> hourGlassSums = new ArrayList<Integer>();
        for (int row = 0; row < GRID_SIZE - 2; row++) {
            for (int column = 0; column < GRID_SIZE - 2; column++) {
                int sum = arr[row][column] + arr[row][column + 1] + arr[row][column + 2] + arr[row + 1][column + 1]
                        + arr[row + 2][column] + arr[row + 2][column + 1] + arr[row + 2][column + 2];
                hourGlassSums.add(sum);
            }
        }
        return Collections.max(hourGlassSums);
    }

    // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
                { 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };

        // for (int i = 0; i < 6; i++) {
        // String[] arrRowItems = scanner.nextLine().split(" ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // for (int j = 0; j < 6; j++) {
        // int arrItem = Integer.parseInt(arrRowItems[j]);
        // arr[i][j] = arrItem;
        // }
        // }

        int result = hourglassSum(arr);
        System.out.println(result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        // scanner.close();
    }
}
