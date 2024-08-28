class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean answer = false;
        HashMap<Integer,Integer> countMap = new HashMap();
        //add first item to map
        // check if next item exists in map
        //if not add it.
        //if yes then duplicate thus return true;
        if (nums.length == 0){
            return answer;
        }
        int firstNum = nums[0];
        countMap.put(firstNum, 1);
        for (int i =1; i < nums.length; i++){
            if(countMap.get(nums[i]) == null ){
                countMap.put(nums[i], 1);
            }else if(countMap.get(nums[i]) == 1){
                answer = true;
            }
        }
        return answer;
    }
}
