import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Character,Integer> mapOne = new HashMap<>();
        mapOne.put('s',1);

        Map<Character,Integer> mapTwo = new HashMap<>();
        mapTwo.put('s',1);

        System.out.println(mapTwo.get('s'));



//        if (mapOne.equals(mapTwo)){
//            System.out.println("yep");
//        } else {
//            System.out.println("nope");
//        }
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if (!sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),1);
            } else
                // char tempChar = s.charAt(i); even isolating the char first to use tempChar in .get doesn't work....
                Integer temp = sMap.get(s.charAt(i)); //this should return the value at a key which is a letter, so why?

                (sMap.replace(s.charAt(i),)))
                    sMap.get(s.charAt(i) )


        }


    }
}

//if map doesn't contain a key, add the key and assign value of 1. reassign valuee increementing ++
// for every duplicate. if map A = map B, then anagram true.