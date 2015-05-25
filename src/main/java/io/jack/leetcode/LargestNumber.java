package io.jack.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber extends AbstractLargestNumber {
	
	static class IntHash {
		int num;
        double hash;
        
        public IntHash () {
        	
        }
        
        public IntHash (int num){
            this.num = num;
            hash = num;
            
            int fenmu = 1; //going to be like 1111
            while ((num /= 10) > 0){
                fenmu = fenmu*10 + 1;
            }
            
            hash = hash / fenmu;
        }
        
        static double hash (int i) {
            double result = i;

            int fenmu = 1; //like 1111
            while ((i /= 10) > 0){
                fenmu = fenmu*10 + 1;
            }
            
            return result / fenmu;
        }
	};
	
	static final IntHash ZeroIntHash;
	static {
		ZeroIntHash = new IntHash();
		ZeroIntHash.num = 0;
		ZeroIntHash.hash = 0.0;
	}
	
	public String largestNumber(int[] num){
		
		if (num.length == 1) {
			return String.valueOf(num[0]);
		}
		
        IntHash[] intHash = new IntHash[num.length];
        for (int i = 0, j = 0; i<num.length; i++) {
        	if (num[i] != 0) {
        		intHash[i] = new IntHash(num[i]);
        		continue;
			}
			intHash[i] = ZeroIntHash;
			j++;
			if (j == num.length) {
				return "0";
			}
        }
        
        StringBuilder result = new StringBuilder();
        
        Arrays.sort(intHash, new Comparator<IntHash>(){
            
            public int compare(IntHash i_hash1, IntHash i_hash2){
                if (i_hash1.hash > i_hash2.hash) {
                    return -1;
                }
                
                if (i_hash1.hash < i_hash2.hash) {
                    return 1;
                }
                
                return 0;
            }
        });
		
        for (int i = 0; i<intHash.length; i++) {
            result.append(intHash[i].num);
        }
		return result.toString();
	}
}
