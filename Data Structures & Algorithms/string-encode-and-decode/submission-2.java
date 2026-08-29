class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append(":").append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> backToList = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int colon = str.indexOf(":", i);
            int size = Integer.parseInt(str.substring(i, colon));
            i = colon + 1;
            backToList.add(str.substring(i, i + size));
            i += size;
        }
        return backToList;
    }
}
