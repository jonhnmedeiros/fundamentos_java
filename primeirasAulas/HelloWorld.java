package primeirasAulas;

/* 
* HelloWorld = Nome da minha classe
* public = Tipo de acesso da classe
* class = Tipo da Classe
*/ 

public class HelloWorld {
   // Todo conteúdo deverá ser inserido aqui dentro

   public static void main (String[] args) {
      // Números (int, double, float, long)
      // Texto (String)
      // Boleanos (boolean)
      
      int dadoDoTipoInt = 10;
      double dadoDoTipoDouble = 3.14;
      float dadoDoTipoFloat = 3.14f;
      long dadoDoTipoLong = 9223372036854775807L;
      String dadoDoTipoString = "Colocar o meu texto";
      boolean dadodoTipoBoolean = false;

      // if - else
      if (dadoDoTipoInt == 10){
         //Sysout
         System.out.println("O valor do Int é igual a 10");
      } else if (dadoDoTipoInt == 12) {
         System.out.println("O valor do Int é igual a 12");
      } else {
         System.out.println("O valor do Int não é igual a 10");
      }

      //while
      int valorInicial = 0;
      while(valorInicial < 10){
         System.out.println("Valor atual: "+valorInicial);
         valorInicial++;
      }

      //for 
      for(int i=0;i<10;i++){
         System.out.println("Valor atual for: "+i);
      }
   } 
}

// Fora do escopo da classe