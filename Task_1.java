import java.util.*;

public class Task_1{
    public static Map<String, List<String>> db = new HashMap<>();
    public static void main(String[] args) {
        add_DB("Igor", Arrays.asList("+79000000000", "+79000000001"));
        add_DB("Anna", Arrays.asList("+79000000002"));
        print_DB();
        print_DB();
        System.out.println(find_Name(db, "+79000000000"));
        System.out.println(find_Phone(db, "Igor"));
    }
    public static void add_DB(String name, List<String> phone) {
        db.put(name, phone);
    }

    public static void delete_DB(String name) {
        db.remove(name);
    }

    public static void print_DB(){
        System.out.println("Телефонный справочник: ");
            System.out.println(db);
    }
    
    public static Set<String> find_Name(Map<String, List<String>> db, String phone){
        Set<String> name = new HashSet<String>();
        for(Map.Entry<String,List<String> > dbEntry : db.entrySet()){
            if(dbEntry.getValue().contains(phone))
                name.add(dbEntry.getKey());
        }
        return name;
    }

    public static List<String> find_Phone(Map<String, List<String>> db, String name){
        List<String> phone = new ArrayList<>();
        phone = db.get(name);
        return phone;
    }
}
