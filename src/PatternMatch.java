
public class PatternMatch {

    public int patternMatch(String exps, String pattern) {
        
        int lengthOfPattern = pattern.length();
        int lengthOfExpression = exps.length();

        if(lengthOfExpression<lengthOfPattern){
            return -1;
        }else if(lengthOfPattern==0){
            return -1;
        }
        else if(exps.equals(pattern)){
            return 0;
        }

        for(int i = 0; i < lengthOfExpression-lengthOfPattern; i++){
            if(exps.toLowerCase().charAt(i) == pattern.toLowerCase().charAt(0)){
                if((i+lengthOfPattern < lengthOfExpression)) {
                    String temp = exps.substring(i, i + lengthOfPattern);
                    if (temp.toLowerCase().equals(pattern.toLowerCase())) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

}
