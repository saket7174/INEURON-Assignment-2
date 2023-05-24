//// Assignment -2,Sollution -5
// Wap to sort an array using "Selection Sort" sort algorithm
public class Fifth{
     public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};
        
        System.out.println("Original array: ");
        printArray(array);
        
        selectionSort(array);
        
        System.out.println("Selection  Sorted array: ");
        printArray(array);
    }
    
    public static void selectionSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            swap(array, i, minIndex);
        }
    }
    
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
