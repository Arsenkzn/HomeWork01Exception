import java.util.Random;

public class task2 {
    public static int error(int[][] array) {
        int sum = 0;
        if (array.length != array[0].length)
            throw new RuntimeException("I exception1");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                if (array[i][j] < 0 || array[i][j] > 1)
                    throw new RuntimeException("I exception 2");
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arrays = new int[5][5];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = new Random().nextInt(2);
            }
        }
        System.out.println(error(arrays));
    }
}
