class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[i] + nums[j] == target){
                    if(i < j){
                        result[0] = i;
                        result[1] = j;
                    }else{
                        result[0] = j;
                        result[1] = i;
                    }
                } 
            }
        }
        return result;
    }
}
