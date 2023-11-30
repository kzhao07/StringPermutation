import java.util.*;

public class Solution {
    public void permute(String str){
        Set<String> permutations = new TreeSet<>();
        Stack<String> container = new Stack<>();
        str = "+" + str;
        container.push(str);

     while (!container.empty()){
            String s = container.pop();
            if (s.endsWith("+")){
                permutations.add(s.substring(0,s.length()-1));
            } else {
                int index = s.indexOf("+");
                String item = "";
                for (int k=index+1; k < s.length(); k++){
                    item = s.substring(0,index);
                    item += s.substring(k, k+1) + "+";
                    item += s.substring(index+1, k);
                    item += s.substring(k+1);
                    container.push(item);
                }

            }
      }

     Iterator<String> it = permutations.iterator();
     while(it.hasNext()){
         System.out.println(it.next());
     }

    }
}
