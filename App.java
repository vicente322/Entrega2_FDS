import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import javax.print.attribute.IntegerSyntax;

public class App {
      
      public static void main(String[] args){

            Collection<Integer> a = CollectionFactory.InsatanceOf().getCollection(true, true, false);
            Collection<Integer> b = CollectionFactory.InsatanceOf().getCollection(false, true, false);
            Collection<Integer> c = CollectionFactory.InsatanceOf().getCollection(false, false, true);
            Collection<Integer> d = CollectionFactory.InsatanceOf().getCollection(false, true, true);

            if (a instanceof ArrayList){
                  System.out.println("A = ArrayList");
            }
            if (b instanceof LinkedList){
                  System.out.println("B = LinkedList");
            }
            if (c instanceof HashSet){
                  System.out.println("C = HashSet");
            }
            if (d instanceof TreeSet){
                  System.out.println("D = TreeSet");
            }
      }
}
