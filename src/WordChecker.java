import java.util.ArrayList;

public class WordChecker {
    /** Initialized in the constructor and contains no null elements */
    private final ArrayList<String> wordList;
    public WordChecker(ArrayList<String> wordList){
        this.wordList = wordList;
    }
    /**
     * Returns true if each element of wordList (except the first) contains the
     * previous
     * element as a substring and returns false otherwise, as described in part (a)
     * Precondition: wordList contains at least two elements.
     * Postcondition: wordList is unchanged.
     */
    public boolean isWordChain() {
        String prevWord = "";
        for (String word: wordList){
            if(!word.contains(prevWord)) return false;
            prevWord =word;
        }
        return true;
    }

    /**
     * Returns an ArrayList<String> based on strings from wordList that start
     * with target, as described in part (b). Each element of the returned ArrayList
     * has had
     * the initial occurrence of target removed.
     * Postconditions: wordList is unchanged.
     * Items appear in the returned list in the same order as they appear in
     * wordList.
     */
    public ArrayList<String> createList(String target) {
        ArrayList<String> newList =  new ArrayList<>();
        for (String word : wordList){
            if(word.startsWith(target)){
                newList.add(word.substring(target.length()));
            }
        }
        return newList;
    }
}