class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0; // 紀錄最大長度
        
        // 遍歷字串 s 的所有子字串
        for (int i = 0; i < s.length(); i++) {
            String substr = ""; // 初始化子字串
            
            for (int j = i; j < s.length(); j++) {
                char currentChar = s.charAt(j);

                // 檢查子字串內是否有重複字元
                boolean isRepeated = false;
                for (int k = 0; k < substr.length(); k++) {
                    if (substr.charAt(k) == currentChar) {
                        isRepeated = true;
                        break;
                    }
                }

                // 若有重複字元，停止這個子字串的擴展
                if (isRepeated) {
                    break;
                }

                // 若無重複，則加入子字串並更新最大長度
                substr += currentChar;
                max = Math.max(max, substr.length());
            }
        }

        return max;
    }
}
