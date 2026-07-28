class Solution {
    char separator = '#';
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<strs.size(); i++)
        {
            String str = strs.get(i);
            sb.append(str.length());
            sb.append(separator);
            sb.append(str);
            sb.append(separator);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> strs = new ArrayList<>();
        int i=0;
       while(i < str.length())
       {
            StringBuilder len = new StringBuilder("");
            while(Character.isDigit(str.charAt(i)))
            {
                len.append(str.charAt(i));
                i++;
            }
            int length = Integer.parseInt(len.toString());
            i++;
            String word = str.substring(i,i+length);
            strs.add(word);
            i = i+length;
            i++;
       }
       return strs;
    }
}
