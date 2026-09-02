class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Increase frequency
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Find maximum frequency
            maxFreq = Math.max(maxFreq, map.get(ch));

            // Characters that need replacement
            int replace = (right - left + 1) - maxFreq;

            // If replacements exceed k, shrink window
            if (replace > k) {
                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}