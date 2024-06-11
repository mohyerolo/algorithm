package 정렬;

import java.util.Arrays;

public class InsertionSort {
    // private static int[] arr = {3, 31, 48, 73, 8, 11, 20, 29, 65, 15};
    private static int[] arr = {1, 2, 5, 8, 11, 50, 51, 100};
    private static StringBuilder sb = new StringBuilder();
    private static int cnt;
    public static void main(String[] args) {
        sb.append("정렬 전: ");
        sb.append(Arrays.toString(arr)).append('\n');
        
        insertion_sort();

        sb.append("정렬 후: ");
        sb.append(Arrays.toString(arr)).append('\n');

        sb.append("while문 반복 횟수: ").append(cnt);
        System.out.println(sb);    
    }

    private static void insertion_sort() {
        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            int sortedIndex = i - 1;
            while (sortedIndex >= 0 && num < arr[sortedIndex]) {
                cnt++;
                arr[sortedIndex + 1] = arr[sortedIndex];
                sortedIndex--;
            }
            arr[sortedIndex + 1] = num;
        }
    }
}
