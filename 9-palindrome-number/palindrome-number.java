class Solution {
    public boolean isPalindrome(int x) {
        String neww="";
        String org=String.valueOf(x);
        for(int i=org.length()-1;i>=0;i--){
            neww=neww+org.charAt(i);
        }
        return org.equals(neww);
        }
    }