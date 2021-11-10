package 排序;

public class Insertion {

    public static void sort(int[] a) {
        int N = a.length;
        for(int i = 1; i < N; i++) {
            for(int j = i; j > 0 && a[j] < a[j - 1]; j--) {
                Utils.exch(a,j,j-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,9,7,1,4,6,8,0};
        sort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
