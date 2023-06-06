import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }
}


class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i))) map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
            // if map contains key at the index of 'i' in the string, we increment the value at that key using
            // .put with fields of 'key, value' where value is +1
            else map1.put(s.charAt(i), 1);

        }
        for (int i = 0; i < t.length(); i++) {
            if (map2.containsKey(t.charAt(i))) map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
            else map2.put(t.charAt(i), 1);

        }

        return map1.equals(map2);

    }
}

// AGAIN MY FAILED SOLUTION THAT WAS ON THE RIGHT TRACK.
//class Solution {
//    public boolean isAnagram(String s, String t) {
//
//        Map<Character, Integer> sMap = new HashMap<>();
//        Map<Character, Integer> tMap = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (!sMap.containsKey(s.charAt(i))) {
//                sMap.put(s.charAt(i), 1);
//            } else
//            (sMap.replace(s.charAt(i),)
//            sMap.get(s.charAt(i))
//                    // got boogered up here in how to writee it, but my idea was valid
//
//
//        }
//
//
//    }
//}

//if map doesn't contain a key, add the key and assign value of 1. reassign valuee increementing ++
// for every duplicate. if map A = map B, then anagram true.