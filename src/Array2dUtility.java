import java.util.Arrays;

public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] a) {
        for (int[] b: a) {
            System.out.println(Arrays.toString(b));
        }
    }
    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] a) {
        int count = 0;
        for (int[] b: a) {
            for (int c: b) {
                count = count + c;
            }
        }
        return count;
    }
    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] a) {
        int length = a.length*a[0].length;
        return (double) sum(a)/length;
    }
    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] a) {
        int smallest = 301231;
        for (int[] b : a) {
            for (int c : b) {
                if (c<smallest) {
                    smallest = c;
                }
            }
        }
        return smallest;
    }
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] a) {
        int biggest = 0;
        for (int[] b : a) {
            for (int c : b) {
                if (c>biggest) {
                    biggest = c;
                }
            }
        }
        return biggest;
    }
    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][]a){
        int count = 0;
        for (int i = 0; i<a.length; i++) {
            for (int j = 0; j<a[0].length; j++)
            if (a[i][j]%2 == 0) {
                count++;
            }
        }
        return count;
    }
    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] a) {
        int count = 0;
        for (int[] b: a) {
            for (int c: b) {
                if (c%2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][]a) {
        for (int[] b: a) {
            for (int c: b) {
                if (c<1) {
                    return false;
                }
            }
        }
        return true;
    }
    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] a) {
        int[] out = new int[a.length];
        for(int i = 0; i<a.length; i++) {
            int sum = 0;
            for (int j = 0; j<a[i].length; j++) {
                sum = sum + a[i][j];
            }
            out[i] = sum;
        }
        return out;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;

        int[] sums = new int[cols];

        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += a[i][j];
            }
            sums[j] = colSum;
        }

        return sums;
    }
}
