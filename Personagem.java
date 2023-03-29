public class Personagem {
      private int visibilidade, poder, vidas;

      private Personagem(int visibilidade, int poder, int vidas){
            this.visibilidade = visibilidade;
            this.poder = poder;
            this.vidas = vidas;
      }

      public static Personagem Normal(){
            return new Personagem(10, 50, 3);
      }
      public static Personagem Poderoso(int poder){
            return new Personagem(10, poder, 3);
      }
      public static Personagem Soturno(int visibilidade){
            return new Personagem(visibilidade, 50, 3);
      }
      public static Personagem Completo(int visibilidade, int poder, int vidas){
            return new Personagem(visibilidade, poder, vidas);
      }



      public String toString(){
            return "Personagem [Visibilidade: " + visibilidade + ", Poder: " + poder + ", Vidas: " + vidas + "]";
      }
}
