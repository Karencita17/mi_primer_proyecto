import java.util.Scanner;

import modelos.pokemones.electricos.Pikachu;
import modelos.pokemones.utils.Color;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pikachu pika1 = new Pikachu("Pikaren", Color.MORADO);
        Pikachu pika2 = new Pikachu("Pikahugo", Color.ROJO);
        System.out.println(pika1.getNombre());
        System.out.println(pika1.equals(pika2));
        pika1.setAtaques();
        System.out.println(pika1.getAtaques());
    }
}
