//Sub Array With Sum 0
class Solution {
    
    static boolean findsum(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            
            if (prefixSum == 0 || set.contains(prefixSum)) {
                return true;
            }

           
            set.add(prefixSum);
        }

     
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 2, -3, 1, 6};
        int n1 = arr1.length;
        System.out.println(findsum(arr1, n1));

        int[] arr2 = {4, 2, 0, 1, 6};
        int n2 = arr2.length;
        System.out.println(findsum(arr2, n2));
    }
}
