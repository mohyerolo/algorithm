package 정렬;

public class SelectionSort_double {

    private int[] list;

    public SelectionSort_double() {}

    public SelectionSort_double(int[] list) {
        this.list = list;
    }
    
    public int selection_sort_double() {
        int minIndex, maxIndex;
        int cnt = 0;
        for (int lIndex = 0, rIndex = list.length - 1; lIndex < rIndex; lIndex++, rIndex--) {
            cnt++;
            minIndex = lIndex;
            maxIndex = rIndex;
            for (int k = lIndex; k <= rIndex; k++) {
                minIndex = list[k] < list[minIndex] ? k : minIndex;
                maxIndex = list[k] > list[maxIndex] ? k : maxIndex;
            }

            if (minIndex != lIndex) {
                swap(lIndex, minIndex);
                if (maxIndex == lIndex) maxIndex = minIndex;
            }
            if (maxIndex != rIndex) {
                swap(rIndex, maxIndex);
            }
        }
        return cnt;
    }

    public void swap(int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
