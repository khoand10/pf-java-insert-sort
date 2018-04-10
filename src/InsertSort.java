/*
@author: khoa
 */
public class InsertSort {
    /*
    method: insert sort list of integer
    input: list integer
    output: sorted list
    dung phan tu thu 2 so sanh voi cach phan tu truoc no, neu nho hon thi swap. sau moi lan lap sublist se tang 1 phan tu
    */
    static void insertSort(int[] list) {
        int currentEle, k;
        for (int i = 1; i < list.length; i++) {
            currentEle = list[i];
            int j = i - 1;
            while ((j > -1) && (list[j] > currentEle)) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = currentEle;
        }
    }

    public static void main(String[] args) {
        int[] list = {5, 1, 13, 54, 9, 10};
        insertSort(list);
        for (int number : list) {
            System.out.println(number);
        }
    }
}
