class Solution {
    public boolean validPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int n = s.length();
        int e = n - 1;

        for (int i = 0; i < n / 2; i++) {

            if (s.charAt(i) != s.charAt(e)) {

                // Delete left character
                if (check(s, i + 1, e)) {
                    return true;
                }

                // Delete right character
                if (check(s, i, e - 1)) {
                    return true;
                }

                return false;
            }

            e--;
        }

        return true;
    }

    public boolean check(String s, int i, int e) {
        while (i < e) {
            if (s.charAt(i) != s.charAt(e)) {
                return false;
            }
            i++;
            e--;
        }

        return true;
    }
}