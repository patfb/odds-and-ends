package prep.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<Integer>();
        int scoreA = 0;
        int scoreB = 0;

        for (int i = 0; i < a.size(); i++) {
            int comparisonResult = Integer.compare(a.get(i), b.get(i));
            if (comparisonResult > 0) {
                scoreA++;
            }
            if (comparisonResult < 0) {
                scoreB++;
            }
        }

        result.add(scoreA);
        result.add(scoreB);

        return result;

    }

    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new
        // InputStreamReader(System.in));

        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        // List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
        // "").split(" ")).map(Integer::parseInt)
        // .collect(toList());

        List<Integer> a = new ArrayList<Integer>();
        a.add(17);
        a.add(28);
        a.add(30);

        List<Integer> b = new ArrayList<Integer>();
        b.add(99);
        b.add(16);
        b.add(8);

        // List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
        // "").split(" ")).map(Integer::parseInt)
        // .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        System.out.println(String.valueOf(result));

        // bufferedWriter.write(result.stream().map(Object::toString).collect(joining("
        // ")) + "\n");

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
