public class Bubble_sort {
//     Time Complexity: O(N2), (where N = size of the array), for the worst, and average cases.
// Space Complexity: O(1).
    public static void main(String[] args) {
        // int[] arr= {13,46,24,52,20,9};
        int[] arr= {1,2,3,4,5,6,7,8};
        int n = arr.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
//Optimized approach
// The best case occurs if the given array is already sorted. We can reduce the time complexity to O(N) by just adding a small check inside the loops.
// We will check in the first iteration if any swap is taking place. If the array is already sorted no swap will occur and we will break out from the loops.
// Thus the iteration of the outer loop will be just 1. And our overall time complexity will be O(N).
// Time Complexity:O(N2) for the worst and average cases and O(N) for the best case. Here, N = size of the array.
// Space Complexity:O(1)
        for(int i=0;i<n-1;i++){
            boolean swap = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.println("After Bubble sort: ");
        for(int nums: arr){
            System.out.print(nums + " ");
        }
    }
} 
