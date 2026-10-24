class Solution {
    public int value(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int i=0;int total =0;
        while(i<s.length()-1){
            if(value(s.charAt(i))<value(s.charAt(i+1))){total = total - value(s.charAt(i));}
            else{total = total + value(s.charAt(i));}
            i++;
        }
        total = total + value(s.charAt(i));
        return total;

    }
}