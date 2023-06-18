import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        
        students.put("Naveen",56);
        students.put("Harsh", 46);
        students.put("Ayush", 58);
        students.put("Naveena", 36);
        students.put("Krish", 56);
        students.put("Naveen", 66);

       for(String name: students.keySet()){
        System.out.println(name+": "+students.get(name));
       }

    }
}
