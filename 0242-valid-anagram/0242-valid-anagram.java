class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}
        Map<Character , Integer> hasy = new HashMap<>();
        for(char ch: s.toCharArray()){
            hasy.put(ch, hasy.getOrDefault(ch,0) + 1);
        }
        for(char cih: t.toCharArray()){
            if (!hasy.containsKey(cih)) {
                return false;
            }
            hasy.put(cih, hasy.get(cih) - 1);
        }
        for (int r : hasy.values()) {
            if (r != 0) {
                return false;
            }
        }

return true;

    }
}