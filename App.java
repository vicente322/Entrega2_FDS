import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class App {
      
      public static void main(String[] args){

            Collection<Integer> a = CollectionFactory.GetInsatance().getCollection(true, true, false);
            Collection<Integer> b = CollectionFactory.GetInsatance().getCollection(false, true, false);
            Collection<Integer> c = CollectionFactory.GetInsatance().getCollection(false, false, true);
            Collection<Integer> d = CollectionFactory.GetInsatance().getCollection(false, true, true);

            ContaBuilder conta1 = new ContaBuilder.Builder(1000, "Joaozinho").build();
            ContaBuilder conta2 = new ContaBuilder.Builder(1002, "Pedrinho")
                                                  .saldoLivre(500)
                                                  .saldoInvestimento(50000)
                                                  .taxaRemuneracao(5)
                                                  .taxaSaldoNegativo(3)
                                                  .categoriaIncial(Categoria.ADVANCED)
                                                  .build();


            System.out.println("Exercicio 1:");
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

            System.out.println("\n\nExercicio 2:");
            System.out.println(conta1.toString() + "\n") ;
            System.out.println(conta2.toString());


      }
}
