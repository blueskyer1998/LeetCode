class Solution {
    public int minDistance(String word1, String word2) {
        if (word1.equals(word2)) {
            return 0;
        }
        return vaild(word1 ,word2);
    }

    private static int vaild(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for (int i=0;i<=word1.length();i++) {
            for (int j=0;j<=word2.length();j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] =0;
                    continue;
                } if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1] );
                }
            }
        }
        int maxlength = dp[word1.length()][word2.length()];
        return word1.length() + word2.length() - 2*maxlength;
    }
}