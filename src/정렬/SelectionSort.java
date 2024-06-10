package 정렬;

public class SelectionSort {
    private static int[] list = {8, 31, 48, 73, 3, 65, 20, 29, 11, 15};
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        selection_sort();
        
        for (int i= 0; i < list.length; i++) {
            sb.append(list[i]).append(' ');
        }
        System.out.println(sb);
    }

    private static void selection_sort() {
        int maxIndex = 0;
        for (int i = list.length - 1; i > 0; i--) {
            maxIndex = findMax(i);
            if (maxIndex != i) {
                swap(i, maxIndex);
            }
        }
    }

    private static int findMax(int now) {
        int maxIndex = now;
        for (int i = now - 1; i >= 0; i--) {
            if (list[maxIndex] < list[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static void swap(int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
