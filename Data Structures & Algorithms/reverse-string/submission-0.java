class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int e=n-1;
        for(int i=0;i<n/2;i++){
            char t=s[i];
            s[i]=s[e];
            s[e]=t;
            e--;
        }
        System.out.println(s.toString()); 
    }
}