class Solution {
    public String sortString(String str){
        String[] strArr = str.split("");
        return Arrays.stream(strArr).sorted().toList().toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        //iterate over strs array
        //for each string find its anagrams. But how?
        ////store each string in a map<k,v>
        ////key is the sorted string, value is List<String>
        //return map's values in a list
        HashMap<String,List<String>> strMap = new HashMap();
        for(String str : strs){
            String sortedStr = sortString(str);
            List<String> strList = new ArrayList();
            List<String> tempStrList = strMap.get(sortedStr);
            if(tempStrList == null){
                strList.add(str);
                strMap.put(sortedStr, strList);
            }else{
                tempStrList.add(str);
                strMap.put(sortedStr, tempStrList);
            }
        }
        List<List<String>> result = new ArrayList();
       for(List<String> strList : strMap.values()){
        result.add(strList);
       }
    return result;
    }
}
