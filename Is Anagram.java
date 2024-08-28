class Solution {
    public boolean isAnagram(String s, String t) {
        //add to list
        //sort list
        //compare them
        //if equal then true

        List<Character> list1 = new ArrayList();
        List<Character> list2 = new ArrayList();

        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            list1.add(c);
        }

        for(int i = 0; i< t.length(); i++){
            Character c = t.charAt(i);
            list2.add(c);
        }

        list1 = list1.stream().sorted().toList();
        list2 = list2.stream().sorted().toList();
        
        return list1.toString().equals(list2.toString());
    }
}
