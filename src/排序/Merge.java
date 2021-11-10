package 排序;

public class Merge {

    static int[] aux = new int[10]; //辅助数组

    public static void merge(int[] a,int low,int mid,int high) {
        int i = low;
        int j = mid + 1;
        for(int k = low;k <= high; k++) {
            aux[k] = a[k];
        }
        for (int k = low; k<= high;k++){
            if(i > mid) {
                a[k] = aux[j++];
            } else if(j > high) {
                a[k] = aux[i++];
            } else if(aux[i] < aux[j]) {
                a[k] = aux[i++];
            }else {
                a[k] = aux[j++];
            }
        }
    }
    public static void sort(int[] a,int low,int high) {
        if(high <= low) return;
        int mid = low + (high - low) /2;
        sort(a,low,mid);
        sort(a,mid+1,high);
        merge(a,low,mid,high);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,9,7,1,4,6,8,0};
        sort(arr,0,arr.length-1);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

}
