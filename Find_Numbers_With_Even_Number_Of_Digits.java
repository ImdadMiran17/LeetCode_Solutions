class Solution {
    public int countDigits(int num){
        int digit = 0;
        while(num!=0){
            num = num/10;
            digit++;
        }
        return digit;
    }
    
    public int findNumbers(int[] nums) {
        int digitNum,even=0;
        for(int i=0;i<nums.length;i++){
            digitNum = countDigits(nums[i]);
            if(digitNum%2 == 0){
                even++;
            }
        }
        return even;
    }
}
