package 排序;

public class Utils {

    public static void exch(int[] a,int i,int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

}
