package wordPattern;

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {

    public boolean wordPattern(String pattern, String word) {

        String[] words = word.split(" ");
        HashMap<Character, String> hashMap = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();
        if (words.length != pattern.length())
            return false;
        for (int i = 0; i < words.length; i++) {
            if (hashMap.containsKey(pattern.charAt(i))) {
                if (hashMap.get(pattern.charAt(i)).equals(words[i]))
                    continue;
                else
                    return false;
            } else {
                if (hashSet.contains(words[i]))
                    return false;
                hashMap.put(pattern.charAt(i), words[i]);
                hashSet.add(words[i]);
            }
        }
        return true;
    }
}
