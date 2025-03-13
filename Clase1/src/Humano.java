public class Humano {
    
    //Atributos
    String nombre;
    byte edad;
    private String identification;

    public Humano(String nuevoNombre, byte nuevaEdad, String nuevoId){
        nombre = nuevoNombre;
        edad = nuevaEdad;
        identification = nuevoId;
    }

    public void saludar(){
        System.out.println("Holaaaaaa, soy " +nombre +", mi cedula es " +identification); //por que aqui se puede usar soup sin el static void main
    }

    public String salario(int salario){
        if (salario == 0){
            return "0";
        } else {
            return "3";
        }
    }


}
