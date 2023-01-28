package leetcode75.level1.strings.task2;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        HashMap<String, Integer> mapChar = new HashMap<>();
        int id = 1;
        ArrayList<Integer> sequence = new ArrayList<>();
        if (s.length() >= t.length()) {
            for (int i = 0; i < s.length(); i++) {
                mapChar.put(Character.toString(s.charAt(i)), id);
                id++;
            }
            for (int i = 0; i < t.length(); i++) {
                sequence.add(mapChar.get(Character.toString(t.charAt(i))));
            }
        }
        else {
            for (int i = 0; i < t.length(); i++) {
                mapChar.put(Character.toString(t.charAt(i)), id);
                id++;
            }
            for (int i = 0; i < s.length(); i++) {
                sequence.add(mapChar.get(Character.toString(s.charAt(i))));
            }
        }
        // сравнить элементы массивов
        for (int i = 0; i < sequence.size()-1; i++){
            if (sequence.get(i+1) - sequence.get(i) < 0){
                return false;
            }
        }
        return true;
    }
}
