class Solution {
    public int strStr(String haystack, String needle) {
        int h =haystack.length();
        int n =needle.length();
        if(h < n){return -1;}
        int i=0;

        while(i<h){
            if((i+n-1)<h && haystack.charAt(i) == needle.charAt(0) && haystack.charAt(i+n-1) == needle.charAt(n-1)){
                if(haystack.substring(i,i+n-1).equals (needle.substring(0,n-1))){return i;}
            }
            i++;
        }return -1;
    }
}