import java.util.HashMap;
import java.util.Map;

public class Task_1 {

    private static String task_1(String s, String t){
        Map<String, Integer> sMap = stringToMap(s);
        Map<String, Integer> tMap = stringToMap(t);
        for(Map.Entry<String, Integer> entry : tMap.entrySet()) {
            if (sMap.containsKey(entry.getKey()) && sMap.get(entry.getKey()).equals(entry.getValue())) {
                continue;
            } else {
                return entry.getKey();
            }
        }
        return "The strings are the same!";
    }

    private static Map<String, Integer> stringToMap(String string) {
        Map<String, Integer> dict = new HashMap<String, Integer>();
        for(int i=0; i<string.length(); i++) {
            String letter = string.substring(i, i+1);
            if (dict.containsKey(letter)) {
                dict.put(letter, dict.get(letter)+1);
            } else {
                dict.put(letter, 1);
            }
        }
        return dict;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(task_1(s, t));
    }
}
