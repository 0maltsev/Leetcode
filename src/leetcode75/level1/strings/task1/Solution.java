//205. Isomorphic Strings
package leetcode75.level1.strings.task1;

import java.util.HashMap;



public class Solution {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<String, Integer> mapOne = new HashMap<>();
        HashMap<String, Integer> mapTwo = new HashMap<>();
        StringBuilder resultOne = new StringBuilder();
        StringBuilder resultTwo = new StringBuilder();
        int id = 1;
        for (int i = 0; i < s.length(); i ++){
            mapOne.putIfAbsent(Character.toString(s.charAt(i)), id);
            id++;
            resultOne.append(mapOne.get(Character.toString(s.charAt(i))));

        }
        id = 1;
        for (int i = 0; i < t.length(); i ++){
            mapTwo.putIfAbsent(Character.toString(t.charAt(i)), id);
            id++;
            resultTwo.append(mapTwo.get(Character.toString(t.charAt(i))));
        }

        System.out.println(resultOne);
        System.out.println(resultTwo);
        return resultOne.toString().equals(resultTwo.toString());
    }
}
