package practice.devin;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Agra");
        placesToVisit.add("Bangalore");
        placesToVisit.add("Chennai");
        placesToVisit.add("Delhi");
        placesToVisit.add("Mumbai");
        printList(placesToVisit);

        boolean added = addInOrder(placesToVisit,"Jaipur");
        if (added){
            System.out.println("Added to linked list");
        }

        printList(placesToVisit);
    }

    public static void printList(LinkedList<String> linkedList){
        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()) System.out.println("Now visiting " + iterator.next());
        System.out.println("=========================");
    }

    public static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()){
            int comparison = listIterator.next().compareTo(newCity);

            if (comparison == 0){
                System.out.println(newCity + " is already a part of the list");
                return false;
            } else if (comparison > 0){
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            } else {
                // If it has greater alphabetical value
            }
        }
        linkedList.add(newCity);
        return true;
    }

}



