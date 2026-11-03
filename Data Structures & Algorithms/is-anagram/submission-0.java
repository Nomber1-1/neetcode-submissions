class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            Integer count = sMap.get(s.charAt(i));
            if (count == null) {
                sMap.put(s.charAt(i), 1);
            } else {
                sMap.put(s.charAt(i), count + 1);
            }

            Integer tCount = tMap.get(t.charAt(i));
            if (tCount == null) {
                tMap.put(t.charAt(i), 1);
            } else {
                tMap.put(t.charAt(i), tCount + 1);
            }
        }
        return sMap.equals(tMap);
    }
}
