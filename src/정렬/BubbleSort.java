package 정렬;

import java.util.Arrays;

public class BubbleSort {
    // private static int[] arr = {3, 31, 48, 73, 8, 11, 20, 29, 65, 15};
    private static int[] arr = {1, 2, 5, 8, 11, 50, 51, 100};
    private static StringBuilder sb = new StringBuilder();
    private static int cnt = 0;

    public static void main(String[] args) {
        
        sb.append("정렬 전: ");
        sb.append(Arrays.toString(arr)).append('\n');
        
        bubble_sort();

        sb.append("정렬 후: ");
        sb.append(Arrays.toString(arr)).append('\n');

        sb.append("반복 횟수: ").append(cnt);
        System.out.println(sb);
    }

    private static void bubble_sort() {
        for (int i = 0; i < arr.length - 1; i++) {
            cnt++;
            for (int j = 0; j < arr.length - (i + 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}