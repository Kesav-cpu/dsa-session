import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        
        // insertion
        map.put("TN","TamilNadu");
        map.put("KA","Karnataka");
        map.put("KL","Kerala");
        
        // search
        System.out.println(map.get("TN"));
        System.out.println(map.get("KA"));
        System.out.println(map.get("AP"));
        System.out.println(map.getOrDefault("AP","not found"));
        
        System.out.println(map.keySet());
        System.out.println(map.values());
        
        map.remove("KL");
        map.remove("KA");
        
        for(String key : map.keySet())
        {
            System.out.println(key +""+map.get(key));
        }
        System.out.println(map.containsKey("AP"));
        System.out.println(map.containsValue("Tamil Nadu"));
        
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
