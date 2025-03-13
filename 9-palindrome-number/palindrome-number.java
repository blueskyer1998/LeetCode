class Solution {
    public boolean isPalindrome(int x) {
        String num = "";
        String xx = Integer.toString(x);
        int n = xx.length();
        for (int i = 1; i <= n; i++) {
            num = num + xx.charAt(n-i);
        }
        if (num.equals(Integer.toString(x))) {
            return true;
        } else {
            return false;
        }
    }
}