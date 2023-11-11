import javax.swing.*;
import java.util.Random;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class LDE {
    Nodo movil = null;
    Nodo cab = null;
    Nodo fin = null;
    private final Random random = new Random();
    private static int minimum = 1;
    private static int maximum = 10;

    public static LDE lde = new LDE();

    public static void main(String[] args) {
    System.out.println("Presiona las flechas <- o ->");
    initial(lde,30);
    JFrame frame = new JFrame("Ejemplo de detección de teclas");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(0, 0);
    JPanel panel = new JPanel();
    frame.add(panel);
    MiKeyListener keyListener = new MiKeyListener();
    panel.addKeyListener(keyListener);
    panel.setFocusable(true);
    panel.requestFocusInWindow();
    frame.setVisible(true);
    }

    private static void initial(LDE lde,int size) {
        Nodo nodo;
        for (int i = 1; i <= size; i++) {
            nodo = new Nodo(lde.random.nextInt(maximum-minimum+1)+minimum,i);
            if (lde.cab==null){
                lde.cab = nodo;
                lde.fin = nodo;
            }else {
                nodo.ant = lde.fin;
                lde.fin.sig = nodo;
                lde.fin = nodo;
            }
        }
    }






    private static void showCola(LDE lde) {
        lde.movil = lde.fin;
        int cont = 1;
        while (lde.movil!=null){
            System.out.println(lde.movil.dato);
            lde.movil = lde.movil.ant;
            cont += 1;
        }
    }

    private static void showCabeza(LDE lde) {
        lde.movil = lde.cab;
        while (lde.movil!=null){
            System.out.println(lde.movil.dato);
            lde.movil = lde.movil.sig;
        }
    }


}