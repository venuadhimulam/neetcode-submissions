class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> counter = new HashMap<>();
        List<List<String>> resultList = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            String curr = strs[i];
            char[] ch = curr.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);

            if (counter.containsKey(sortedStr)) {
                counter.get(sortedStr).add(curr);
            } else {
                List<String> anagramList = new ArrayList<>();
                anagramList.add(curr);
                counter.put(sortedStr, anagramList);
            }
        }

        for (var entry: counter.entrySet()) {
            System.out.println(entry.getKey() + "..." + entry.getValue());
            resultList.add(entry.getValue());
        }

        return resultList;
    }
}
