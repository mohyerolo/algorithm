package 정렬;

public class SelectionSort_double_test {
    private static int[] list = {8, 31, 48, 73, 3, 65, 20, 29, 11, 15};
    private static int[] list2 = {1, 2, 3, 4, 5, 6, 7, 1};
    private static int[] list3 = {100, 99, 50, 30, 20, 10};
    private static int[] list4 = {8, 31, 48, 73, 3, 65, 20, 29, 11, 15, 6, 31, 50, 100, 91, 52, 1};
    private static StringBuilder sb = new StringBuilder();
    private static SelectionSort_double inner;

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();      
        
        System.out.println(sb);
    }

    private static void test1() {
        appendListLength(list);

        inner = new SelectionSort_double(list);
        int cnt = inner.selection_sort_double();

        appendInnerLoopCnt(cnt);
        appendSortedList(list);
    }

    private static void test2() {
        appendListLength(list2);    

        inner = new SelectionSort_double(list2);
        int cnt = inner.selection_sort_double();

        appendInnerLoopCnt(cnt);        
        appendSortedList(list2);
    }

    private static void test3() {
        appendListLength(list3);

        inner = new SelectionSort_double(list3);
        int cnt = inner.selection_sort_double();

        appendInnerLoopCnt(cnt);        
        appendSortedList(list3);
    }

    private static void test4() {
        appendListLength(list4);

        inner = new SelectionSort_double(list4);
        int cnt = inner.selection_sort_double();

        appendInnerLoopCnt(cnt);
        appendSortedList(list4);
    }

    private static void appendListLength(int[] arr) {
        sb.append("\n이중 선택 정렬 실행 - 원소 개수: ").append(arr.length).append('\n');
    }

    private static void appendInnerLoopCnt(int cnt) {
        sb.append("최소, 최대 찾는 반복 횟수: ").append(cnt).append('\n');
    }

    private static void appendSortedList(int[] arr) {
        for (int i= 0; i < arr.length; i++) {
            sb.append(arr[i]).append(' ');
        }
        sb.append('\n');
    }
    
}