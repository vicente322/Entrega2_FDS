import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * 
 * @author @vicente322 @gabicolares
 * @version 2023-03-28
 */

public class CollectionFactory<E> {
      private static CollectionFactory collec = new CollectionFactory();

      public static CollectionFactory GetInsatance(){
            return collec;
      }

      private CollectionFactory(){
            
      }

      public Collection<E> getCollection(boolean knownSize, boolean inOrder, boolean noRepeat){
            Collection<E> c = null;

            if (knownSize && inOrder && !noRepeat){
                  c = new ArrayList<>();
            }
            else if (!knownSize && inOrder && !noRepeat){
                  c = new LinkedList<>();
            }
            else if (!knownSize && !inOrder && noRepeat){
                  c = new HashSet<>();
            }
            else if (!knownSize && inOrder && noRepeat){
                  c = new TreeSet<>();
            }

            return c;
      }
}
