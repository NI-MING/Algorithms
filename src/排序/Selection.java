package 排序;

public class Selection {

    public static void sort(int[] a) {
        int N = a.length;
        for(int i = 0; i < N; i++) {
            int min = i;
            for(int j = i + 1; j < N; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
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
