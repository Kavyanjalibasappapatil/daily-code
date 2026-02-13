class Solution {
    public int maxFrequencyElements(int[] nums) {
            Arrays.sort(nums);
            int max = 1, count = 1, sum = 0;
            for(int i = 1; i < nums.length; i++)
            {
                if(nums[i] == nums[i-1])
                count++;
                else{
                    if(count > max){
                        max = count;
                        sum = count;
                    }
                    else if(count == max){
                        sum += count;
                    }
                    count = 1;
                    }
                }
                if(count > max) sum= count;
                else if(count == max) sum += count;
        return sum;
    }
}
