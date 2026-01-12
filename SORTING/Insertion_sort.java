public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {14,9,15,12,6,8,13};
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
/*Time Complexity: O(n^2), where n is the number of elements in the array. This is because, in the worst case, we may have to compare each element with all the previous elements.

Space Complexity: O(1), as we are sorting the array in place and not using any additional data structures that grow with input size.*/
        System.out.println("After Insertion sort: ");
        for(int nums: arr){
            System.out.print(nums+" ");
        }
    }
}
