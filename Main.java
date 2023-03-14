import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<String> names = new ArrayList<String>();
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");
    
    Iterator<String> iterator = names.iterator();
    while (iterator.hasNext()) {
      String name = iterator.next();
      System.out.println(name);
    }
  }
}
