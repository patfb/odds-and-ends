package prep.arrays;

public class Bribes {

    public static final int MAX_BRIBES = 2;

    static void minimumBribes(int[] peopleWaiting) {
        int totalBribes = 0;
        for (int i = peopleWaiting.length - 1; i >= 0; i--) {
            int placeInLine = i + 1;
            if (peopleWaiting[i] - placeInLine > MAX_BRIBES) {
                System.out.println("Too chaotic");
                return;
            } else {
                for (int j = Integer.max(0, peopleWaiting[i] - MAX_BRIBES); j < i; j++) {
                    if (peopleWaiting[j] > peopleWaiting[i]) {
                        totalBribes++;
                    }
                }
            }
        }

        System.out.println(totalBribes);
    }

    // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] validPeopleWaiting = { 2, 1, 5, 3, 4 };
        int[] invalidPeopleWaiting = { 2, 5, 1, 3, 4 };

        minimumBribes(validPeopleWaiting);
        minimumBribes(invalidPeopleWaiting);

        // int t = scanner.nextInt();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // for (int tItr = 0; tItr < t; tItr++) {
        // int n = scanner.nextInt();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // int[] q = new int[n];

        // String[] qItems = scanner.nextLine().split(" ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // for (int i = 0; i < n; i++) {
        // int qItem = Integer.parseInt(qItems[i]);
        // q[i] = qItem;
        // }

        // minimumBribes(q);
        // }

        // scanner.close();
    }
}
