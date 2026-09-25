class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLen = 0;
       HashSet<Integer> numSet = new HashSet<>();
       for(int num : nums)
       {
            numSet.add(num);
       }

        for(int num: numSet)
        {
            if(!numSet.contains(num-1))
            {
                int len = 1;
                while(numSet.contains(num + len)){
                    len++;
                }
                longestLen = Math.max(longestLen, len);
            }
        }
        return longestLen;
    }
}
