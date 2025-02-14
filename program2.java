import java.util.*;
public class Main {
    public static void main(String[] args) {
        Hashtable<String,String> table = new Hashtable<>();
        
        table.put("TN","TamilNadu");
        table.put("KA","Karnataka");
        table.put("KL","Kerala");
        //table.put(null,null);
        
        
        for(String key : table.keySet())
        {
            System.out.println(key +""+table.get(key));
        }
        
        HashSet<Integer>set = new HashSet<>();
        
        set.add(2); set.add(4); set.add(5); set.add(6);
        
        for(Integer i:set){
            System.out.println(i);
        }
    }
}
