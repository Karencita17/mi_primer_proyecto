import java.util.ArrayList;

public class Basic {
    public static void main (String[] args){
        System.out.println("Hola mundo");

        float edad = 15.5f; //Se pone f o F para que tome el float
        System.out.println(edad);

        char letter = 'a'; //comillas simples para char
        System.out.println(letter);

        //Ciclos
        int arreglo [] = {1, 2, 3, 4, 5, 6}; //creacion de lista
        for (int i = 0; i < arreglo.length; i++){
            if(i == 3){
                continue;   //salta el siguiente(4)
            }
            System.out.println(arreglo[i]);
        }

        //Listas
        int array [] = new int [7];
        array[3] = 34;
        ArrayList <String> lista = new ArrayList<String>();
        lista.add("Hola");
        lista.add("Adios");
        lista.add(1,"mitad");
        for(int i = 0; i<lista.size(); i++){
            System.out.println(lista.get(i)); //obtener caracteres de la lista
        }

        byte numero = 4;
        while(numero != 0){
            System.out.println(numero);
            numero = (byte) (numero - 1); //convertir a byte porque lo toma como int
        }

        //String Functions
        String text = "Hola Karen";
        int largo = text.length(); //longitud de texto
        System.out.println(largo);

        String texto = text.replace("Karen", "Hugo"); //remplazar
        System.out.println(texto);

        System.out.println(texto.endsWith("go")); //verifica final del texto
        System.out.println(texto.startsWith("Ho")); //verifica inicio del texto
        System.out.println(texto.contains("Hug")); //verifica cadena de texto
        System.out.println(texto.indexOf("Hol")); //muestra la posicion

        System.out.println(texto.toUpperCase()); //mayus todo
        System.out.println(texto.toLowerCase()); //minus todo

        String space = "   Espacios   ";
        System.out.println(space.trim()); //elimina espacios

        //Escape
        String comillas = "C: \\Hola \"Mundo\">"; //mostrar ruta y comillas
        System.out.println(comillas);
    }
}
