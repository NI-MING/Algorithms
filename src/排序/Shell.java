package 排序;

public class Shell {

    public static void sort(int[] a){
        int N = a.length;
        int h = 1;
        while(h < N/3) h = 3*h + 1;
        while(h >= 1) {
            for (int i = h; i < N; i++){
                for (int j = i; j >= h && a[j] < a[j - h];j -= h) {
                    Utils.exch(a,j,j-h);
                }
            }
            h = h/3;
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
