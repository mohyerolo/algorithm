package 정렬;

import java.util.Arrays;

public class MergeSort {
    private static int[] arr = {31, 3, 65, 73, 8, 11, 20, 29, 48, 15};
    // private static int[] arr = {3, 5, 2, 1, 6};
    private static int[] temp = new int[arr.length];
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        sb.append("정렬 전: ").append(Arrays.toString(arr)).append('\n');

        merge_sort(0, arr.length - 1);

        sb.append("정렬 후: ").append(Arrays.toString(arr));
        System.out.println(sb);
    }

    private static void merge_sort(int left, int right) {
        int mid;

        if (left < right) {
            mid = (left + right) / 2;
            merge_sort(left, mid);
            merge_sort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    private static void merge(int left, int mid, int right) {
        int t = left, l = left, r = mid + 1;

        while (l <= mid && r <= right) {
            temp[t++] = arr[l] < arr[r] ? arr[l++] : arr[r++];
        }

        while (l <= mid) {
            temp[t++] = arr[l++];
        }
        while (r <= right) {
            temp[t++] = arr[r++];
        }

        for (int i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }
}
