package HWexception1;


public class Third {
//        3.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//        каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
//        необходимо как-то оповестить пользователя.


    public static void main(String[] args) {
        int[] a = {34, 34, 35, 55, 53, 2};
        int[] b = {33, 31, 22, 21, 32};
        int[] c = new int[6];
        if (a.length != b.length){
            System.out.println("Длины массивов не равны");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i] = a[i] - b[i];
            }
            System.out.println(c[i]);
        }
    }
}
