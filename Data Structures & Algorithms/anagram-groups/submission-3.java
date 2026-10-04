class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            int[] fre = new int[26];
            for(char c:s.toCharArray())
            {
                fre[c-'a']++;
            }
            StringBuilder key = new StringBuilder();
            for(int i=0;i<26;i++)
            {
                key.append('@');
                key.append(fre[i]);
            }
            String key_string= key.toString();
            if(!map.containsKey(key_string))
            {
                map.put(key_string,new ArrayList<>());
            }
            map.get(key_string).add(s);

        }
        return new ArrayList<>(map.values()); 
    }
}
