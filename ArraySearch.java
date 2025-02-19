// Function to search for an element in an array
public class ArraySearch {
public static int searchElement(int[] arr, int target) {
for (int i = 0; i < arr.length; i++) {
if (arr[i] == target) {
return i;
}
}
return -1; // If element is not found
}
public static void main(String[] args) {
int[] arr = {1, 2, 3, 4, 5};
int target = 3;
int index = searchElement(arr, target);
System.out.println("Element found at index: " + index);
}
}
