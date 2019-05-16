import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        int a = 0;
        int b = 0;
        int x;
        Set<String> s = new HashSet<String>();
        for (int i = 0; i <names1.length ; i++) {
            for (int j = 0; j <names2.length ; j++) {
                if(names1[i].equals(names2[j])){
                    a++;
                }
            }
        }

        Collections.addAll(s, names1);
        Collections.addAll(s, names2);
        Iterator it = s.iterator();
        String names[] = s.stream().toArray(String[]::new);
        return names;



    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}