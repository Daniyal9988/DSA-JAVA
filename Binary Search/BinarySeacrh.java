public class BinarySearch {
    public static int search(int[] arr, int target) {
      int left = 0;
      int right = arr.length;
  
      while(right > left) {
        int mid = Math.floorDiv(left + right, 2);
        int midValue = arr[mid];
  
        if (midValue == target) {
          return mid;
        } else if (target > midValue) {
          left = mid + 1;
        } else {
          right = mid;
        }
  
      }
  
      return -1;
    }
  
    public static void main(String[] args) {
      int[] searchable = {1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94};
      int target = 8;
  
      System.out.println(search(searchable, target));
    }
  
  }