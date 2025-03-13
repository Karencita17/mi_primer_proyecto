package modelos.pokemones.electricos;

import java.util.ArrayList;
import modelos.pokemones.utils.Color;
import modelos.pokemones.utils.Ataques;
import java.util.Scanner;

public class Pikachu {
    private String nombre;
    private Color colorCachetes;

    public Pikachu(String nombre, Color colorCachetes) {
        this.nombre = nombre;
        this.colorCachetes = colorCachetes;
        ataques = new ArrayList<Ataques>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColorCachetes() {
        return colorCachetes;
    }

    public void setColorCachetes(Color colorCachetes) {
        this.colorCachetes = colorCachetes;
    }

    private ArrayList <Ataques> ataques = new ArrayList<>();
    
    public ArrayList<Ataques> getAtaques() {
        return ataques;
    }

    public void setAtaques(){
        System.out.println("Ingresa los ataques");
        for(int i = 0; i <  4; i++){
            System.out.println("Ingresa el ataque");
            for(Ataques ataque : Ataques.values()){
                System.out.println("Ataque: "+ataque);
            }
            Scanner scanner = new Scanner(System.in);
            String ataqueS = scanner.next();
            Ataques ataquen = Ataques.valueOf(ataqueS);
            ataques.add(ataquen);
        }
    }


}
