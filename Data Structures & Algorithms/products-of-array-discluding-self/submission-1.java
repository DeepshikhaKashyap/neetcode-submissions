class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int product = 1;
       for(int i=0; i<n; i++){
            prefix[i] = product;
            product = product * nums[i];
       }
       
       product = 1;
       for(int i=n-1; i>=0; i--)
       {
            suffix[i] = product;
            product = product * nums[i];
       }

       for(int i=0; i<n; i++)
       {
            res[i] = prefix[i] * suffix[i];
       }
       return res;
    }
}  
