import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<String> NS = new ArrayList<String>();
        List<String> Names = new ArrayList<String>();
        Map<String, Integer> db = new HashMap<String, Integer>();
        list.addAll(Arrays.asList("Иван Ивано", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));        
        list.stream().forEach(str -> {
            NS.addAll(Arrays.asList(str.split("\\s")));
        });
        //System.out.println(NS.toString());
        for (int i = 0; i < NS.size();  i += 2){
            Names.addAll(Arrays.asList(NS.get(i)));
        }
        Set<String> unique = new HashSet<String>(Names);
        for (String key : unique) {
            db.put(key, Collections.frequency(Names, key));
        }    
        db.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
   
