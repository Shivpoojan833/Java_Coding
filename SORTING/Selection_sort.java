public class Selection_sort{
    public static void main(String[] args) {
        int[] arr= {7,5,9,2,8};        /*Time Complexity:O(N^2),Selection sort runs in O(N²) time in the best, average, and worst cases due to its nested loop structure. It makes approximately N(N-1)/2 comparisons, regardless of the array's initial state. Even if no swaps are needed (best case), the number of comparisons remains the same./p>

Space Complexity: O(1). No extra space used*/
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After selection sort: ");
        for(int nums: arr){
            System.out.print(nums + " ");
        }
    }
}