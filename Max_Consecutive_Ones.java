class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int numOfOnes = 0;
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                count = 0;
            }else{
                count++;
                numOfOnes = Math.max(numOfOnes,count);
            }
        }
        return numOfOnes;
    }
};
