//Assignment -2,Sollution -6
// Wap to check  weather an array is sub set of another 
import java.util.Arrays;

public class Sixth{
    
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 5};
        int[] array3 = {6, 7};
        
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Array 3: " + Arrays.toString(array3));
        
        System.out.println("Array 2 is a subset of Array 1: " + isSubset(array1, array2));
        System.out.println("Array 3 is a subset of Array 1: " + isSubset(array1, array3));
    }
    
    public static boolean isSubset(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        int i = 0, j = 0;
        
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                i++;
            } else if (array1[i] == array2[j]) {
                i++;
                j++;
            } else {
                return false;
            }
        }
        
        if (j == array2.length) {
            return true;
        }
        
        return false;
    }
}

