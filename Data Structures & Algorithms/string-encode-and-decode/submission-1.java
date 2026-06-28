class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            String s = strs.get(i);
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int strLen = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + strLen;

            String res = str.substring(i,j);
            decodedList.add(res);
            i = j;
        }

        return decodedList;
    }
}