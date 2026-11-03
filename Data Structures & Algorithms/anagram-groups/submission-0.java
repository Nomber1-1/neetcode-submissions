class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 1. Fixed raw type by specifying <String, List<String>>
        HashMap<String, List<String>> temp = new HashMap<>();
        
        for (String str : strs) {
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            
            // 2. Converted char[] to String so it matches the map's key type
            String sortedStr = new String(strArr);
            
            List<String> tempList = temp.getOrDefault(sortedStr, new ArrayList<>());
            tempList.add(str);
            
            // 3. Added back into the map (since getOrDefault creates a local reference)
            temp.put(sortedStr, tempList);
        }
        
        // 4. Cleaned up the unused 'result' variable and returned directly
        return new ArrayList<>(temp.values());
    }
}