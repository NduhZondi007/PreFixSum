import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        //adding values to the linked list
        int values = input.nextInt();
        while (input.hasNextInt()) {
            values = input.nextInt();
            list.add(values);
        }

        //sequential prefix sum
        for (int i=1; i<list.size(); ++i){
            list.set(i, list.get(i-1) + list.get(i));
        }
        
    }
}
