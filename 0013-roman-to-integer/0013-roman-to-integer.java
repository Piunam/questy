class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int prevVal = 0;
        
        // Loop backwards from the last character to the first
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentVal = getVal(s.charAt(i));
            
            // If current value is smaller than the one to its right, subtract it
            if (currentVal < prevVal) {
                total -= currentVal;
            } else {
                total += currentVal;
                prevVal = currentVal; // Update the peak value seen so far
            }
        }
        
        return total;
    }
    
    private int getVal(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
