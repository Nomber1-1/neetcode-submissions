class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            Integer count = sMap.getOrDefault(s.charAt(i), 0);
            sMap.put(s.charAt(i), count + 1);

            Integer tCount = tMap.getOrDefault(t.charAt(i), 0);
            tMap.put(t.charAt(i), tCount + 1);
        }
        return sMap.equals(tMap);
    }
}
