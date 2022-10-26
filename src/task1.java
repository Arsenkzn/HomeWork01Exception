public class task1 {
        public static void main(String[]args){
                int[] array = {2,3,4,34,23,234,235};
                System.out.println(error(array, 786));
        }
        public static int error(int[] array, int count){
                int n = 0;
                if (array == null){
                        return -3;
                } else if (array.length < 5) {
                        return -1;
                }

                boolean check = false;
                for (int i = 0; i < array.length; i++) {
                        n += array[i];
                        if (array[i] == count) check = true;
                }
                System.out.println(n);
                if (check)
                        return -2;
                else if (n<1000 && array[2] != 3) {
                        return -4;
                }
                return 1;
        }

}

