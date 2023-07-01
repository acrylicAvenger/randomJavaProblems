import java.util.Arrays;

public class sortingFunctions {
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

    void selectionSort(int[] array){
        // variable to store the least value
        int smallestNumber;
        for(int i=0;i <= array.length-1;i++){
            smallestNumber = array[i];
            for(int j=i+1; j<array.length;j++){
                if(array[j]<smallestNumber)
                    smallestNumber=array[j];
            }
            int temp = array[i];
            array[i] = smallestNumber;
            smallestNumber = array[i];
        }
        System.out.println("The output of selection sort is: " + Arrays.toString(array));
    }
    public static void main(String[] args) {
        sortingFunctions object = new sortingFunctions();
        int[] array = {2,5,4,8,9,5,6,3};
        int[] array2 = {10,9,8,7,6,5,4,3,2,1};
        object.bubbleSort(array);
        object.insertionSort(array2);
        object.selectionSort(array2);
    }
}