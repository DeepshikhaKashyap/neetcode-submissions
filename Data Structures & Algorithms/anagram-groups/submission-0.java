class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Arrays.sort(strs);
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            String s = strs[i];
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
       
        }
    return new ArrayList<>(map.values());
    }
}