package practice.devin;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Mumbai");
        placesToVisit.add("Mangalore");
        placesToVisit.add("Pune");
        placesToVisit.add("Delhi");
        placesToVisit.add("Manali");
        printList(placesToVisit);

    }

    public static void printList(LinkedList<String> linkedList){
        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println("Now visiting " + iterator.next());
        }
        System.out.println("************************");
    }
}
