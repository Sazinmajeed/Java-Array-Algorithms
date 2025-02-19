// Function to insert an element at a given position
import java.util.*;
public class ArrayInsertion {
public static int[] insertElement(int[] arr, int element, int position) {
int[] newArr = new int[arr.length + 1];
for (int i = 0, j = 0; i < newArr.length; i++) {
if (i == position) {
newArr[i] = element;
} else {
newArr[i] = arr[j];
j++;
}
}
return newArr;
}
public static void main(String[] args) {
int[] arr = {1, 2, 3, 4, 5};
int element = 10;
int position = 2;
int[] updatedArr = insertElement(arr, element, position);
System.out.println("Updated Array: " + Arrays.toString(updatedArr));
}
}
