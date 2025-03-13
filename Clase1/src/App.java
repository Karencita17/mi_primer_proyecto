public class App {

    public static void main (String[] args){
        Humano humano1 = new Humano("Karen", (byte)17, "123456789");
        Humano humano2 = new Humano("Hugo", (byte)17, "987654321");
        System.out.println(humano1.nombre);
        System.out.println(humano1.edad);
        humano1.saludar();
        humano2.saludar();
        System.out.println(humano1.salario(20000));

    }
}
