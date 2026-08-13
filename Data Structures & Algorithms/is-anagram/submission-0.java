class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        for(int i=0;i<c1.length;i++)
        {
            hm.put(c1[i],hm.getOrDefault(c1[i],0)+1);
        }
        for(int i=0;i<c2.length;i++)
        {
            if(hm.containsKey(c2[i])){
                hm.put(c2[i],hm.get(c2[i])-1);
                if(hm.get(c2[i])==0){
                    hm.remove(c2[i]);
            }
            }
            else{
                return false;
            }

        }
        return hm.isEmpty();
        }
}
