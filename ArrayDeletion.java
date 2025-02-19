// Function to delete an element at a given position
import java.util.*;
public class ArrayDeletion {
public static int[] deleteElement(int[] arr, int position) {
if (position >= arr.length) return arr;
int[] newArr = new int[arr.length - 1];
for (int i = 0, j = 0; i < arr.length; i++) {
if (i != position) {
newArr[j++] = arr[i];
}
}
return newArr;
}
public static void main(String[] args) {
int[] arr = {1, 2, 3, 4, 5};
int position = 2;
int[] updatedArr = deleteElement(arr, position);
System.out.println("Updated Array: " + Arrays.toString(updatedArr));
}
}
