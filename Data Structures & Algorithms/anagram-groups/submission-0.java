class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> counter = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String originalStr = strs[i];
            char[] ch = originalStr.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            if (!counter.containsKey(key)){
                counter.put(key, new ArrayList<>());
            }

            counter.get(key).add(originalStr);
        }

        for (Map.Entry<String, List<String>> entry : counter.entrySet()) {
            res.add(entry.getValue());
        }

        return res;
    }
}
