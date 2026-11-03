class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            // 1. Create a frequency array for characters 'a' through 'z'
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            
            // 2. Build a unique String key from the frequency array
            // Using a delimiter like '#' prevents ambiguity (e.g., counts 1 and 12 vs 11 and 2)
            StringBuilder sb = new StringBuilder();
            for (int freq : count) {
                sb.append('#').append(freq);
            }
            String key = sb.toString();
            
            // 3. Group the string into the map
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}