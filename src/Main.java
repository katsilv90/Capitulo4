import java.util.ArrayList;

//tipos de wrapers
public class Main {
    public static void main(String[] args){
 /*

 //-----------//---------------------------
          int numeroPrimitivo = 10;
        Integer numeroObjeto = 20;

        System.out.println(numeroPrimitivo+numeroObjeto);
      //  ------------------//-----------------------
 //int
        int numero =10;
        System.out.println(numero+5);
//------------------------------//-----------------
    //Interger
    Integer numeroInterger =10;
        System.out.println(numeroInterger.toString());
        System.out.println(Integer.parseInt("20")+5); //Converte string em int

//-------------------------------------//------------------------
        //Metodos uitlitários
        int numero = Integer.parseInt("123");
        System.out.println(numero+1);

        String texto=Integer.toString(456); //transforma inteiro em string "456"
        System.out.println(texto);
//-----------------------------//-------------------------------------
        //Valor máximo e mínimo
        System.out.println("Máximo: " + Long.MAX_VALUE); //o long aumenta o limite do valor
        System.out.println("Máximo: " + Integer.MAX_VALUE);
        System.out.println("Máximo: " + Short.MAX_VALUE); //o short reduz a quantidade dos digitos

        System.out.println("Mínimo: " + Long.MIN_VALUE); //o long aumenta o limite do valor O MIN vai a valores negativos
        System.out.println("Mínimo: " + Integer.MIN_VALUE);
        System.out.println("Mínimo: " + Short.MIN_VALUE); //o short reduz a quantidade dos digitos

        int resultado = Integer.compare(30,20);
        System.out.println(resultado);
//----------------------------------------//------------------------------
*/

        //ArraysList
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("Primeiro número: "+numeros.get(0)); // printa 1a posição do array
        System.out.println("Todos os números"); //para printar a lista completa
        for(Integer n:numeros){        //n foi a variável para a lista completa
            System.out.println(n);
        }

        numeros.remove(Integer.valueOf(20));    //remover da lista
        System.out.println("Tamanho da lista " + numeros);
        System.out.println("Tamanho da lista " + numeros.size()); //Tamanho da lista

        int[] numberArray = new int[3];

        //-------------------------------------//---------------------


        //Adicionar
        numberArray[0]=10;
        numberArray[1]=20;
        numberArray[2]=30;
        System.out.println(numberArray[0]);
        for (int i=0;i<3;i++){
            System.out.println(numberArray[i]);
        }

        numberArray[1]=12;   //para alterar o número 20 que está na posição 1 para 12
        for (int i=0;i<3;i++){
            System.out.println(numberArray[i]);
        }
    }
}
