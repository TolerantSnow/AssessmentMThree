package assessment;

public class SummativeSums {
    public static void main(String[] args) {
        int[][] arrays = {
                { 1, 90, -33, -55, 67, -16, 28, -55, 15 },
                { 999, -60, -77, 14, 160, 301 },
                { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 }
        };
        int count = 1;
        for(int[] array : arrays) {
            System.out.printf("#%d Array Sum: %d\n", count++, sumArray(array));
        }
    }
    private static int sumArray(int[] input) {
        int count = 0;
        for(int in : input) {
            count += in;
        }
        return count;
    }
}
