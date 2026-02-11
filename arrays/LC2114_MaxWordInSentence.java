
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(int i =0;i<sentences.length;i++){
            String sentence = sentences[i];
            int spaceCount=0;
        
        for(int j=0;j<sentence.length();j++){
            if (sentence.charAt(j)==' '){
                spaceCount++;
            }
        }
        int words = spaceCount + 1;
        if (words>maxWords){
            maxWords = words;
        } 
        }
        return maxWords;        
    }
}
    

