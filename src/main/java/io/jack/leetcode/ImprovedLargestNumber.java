package io.jack.leetcode;

public class ImprovedLargestNumber extends AbstractLargestNumber {
    
    @Override
    public String largestNumber(int[] num) {
        if (num.length == 1) {
            return String.valueOf(num[0]);
        }
        
        int detect_zero = 0;
        
        double[] hash = new double[num.length];
        
        hash[0] = intHash(num[0]);
        if (num[0] == 0) {
            detect_zero++;
        }
        
        for (int i = 1; i < num.length; i++) {
            
            final double hash_i = intHash(num[i]);
            final int num_i = num[i];
            
            // from back toward k>=0
            int k = i - 1;
            for (; k != -1; k--) {
                
                if (hash[k] > hash_i) {
                    hash[k + 1] = hash[k];
                    num[k + 1] = num[k];
                } else {
                    
                    break;
                }
            }
            
            hash[k + 1] = hash_i;
            num[k + 1] = num_i;
            
            if (num_i == 0) {
                detect_zero++;
            }
        }
        
        if (detect_zero == num.length) {
            return "0";
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int i = num.length - 1; i >= 0; i--) {
            result.append(num[i]);
        }
        
        return result.toString();
    }
    
    static double intHash(int num) {
        if (num < 10) {
            return num;
        }
        
        double hash = num;
        
        int fenmu = 1; //going to be like 1111
        while ((num /= 10) > 0) {
            fenmu = fenmu * 10 + 1;
        }
        
        hash = hash / fenmu;
        
        return hash;
    }
    
}
