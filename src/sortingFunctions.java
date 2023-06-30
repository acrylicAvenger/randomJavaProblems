import java.util.Arrays;
class functions {
    void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("The output of bubble sort is: "+Arrays.toString(array));
    }
    void insertionSort(int[] array){
        for(int i=1;i<array.length;i++){
            int key = array[i];
            int j = i-1;
            while(j>=0 && array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1] = key;
        }
        System.out.println("The output of insertion sort is: " + Arrays.toString(array));
    }
}

public class sortingFunctions {
    public static void main(String[] args) {
        functions object = new functions();
        int[] array = {2,5,4,8,9,5,6,3};
        int[] array2 = {10,9,8,7,6,5,4,3,2,1};
        object.bubbleSort(array2);
        object.insertionSort(array2);
    }

}