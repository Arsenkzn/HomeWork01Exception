package HWexception1;

public class HWexception1 {
    //1.Реализуйте 3 метода, чтобы в каждом из них получить разные исключения


    public static void main(String[] args) {
        //dividzero();
        //strMethod();
        Idex();
    }

    private static int dividzero() {
        return 10/0;
    }

    private static void strMethod(){
        String str = null;
        System.out.println(str.length());
    }

    private static void Idex(){
        int[] array = new int[10];
        array[55] = 66;
    }
}
