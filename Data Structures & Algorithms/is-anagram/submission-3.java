class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> s_map = new HashMap<>();
        Map<Character, Integer> t_map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char s_ch = s.charAt(i);
            char t_ch = t.charAt(i);

            if (s_map.containsKey(s_ch)) {
                s_map.put(s_ch, s_map.getOrDefault(s_ch, 0) + 1);
            } else {
                s_map.put(s_ch, 1);
            }

            if (t_map.containsKey(t_ch)) {
                t_map.put(t_ch, t_map.getOrDefault(t_ch, 0) + 1);
            } else {
                t_map.put(t_ch, 1);
            }
        }

        return s_map.equals(t_map);
    }
}
