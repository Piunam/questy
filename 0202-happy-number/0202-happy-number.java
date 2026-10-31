class Solution {
    public int Digit_sum(int a){
        int sum =0;
        while(a>0)
        {int k = a%10;
        a= a/10;
        sum = sum + (k * k);}
        return sum;

    }
    public boolean isHappy(int n) {
        Set <Integer> s = new HashSet<>();
        while(n != 1 && !s.contains(n)){
            s.add(n);
            n = Digit_sum(n);
        }
        return n==1;
    }
}