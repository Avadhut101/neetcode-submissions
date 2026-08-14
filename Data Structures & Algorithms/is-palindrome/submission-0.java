class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n=s.length();
        int e=n-1;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(e)){
                return false;
            }
            e--;
        }
        return true;
    }
}
