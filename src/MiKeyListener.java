
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class MiKeyListener implements KeyListener {

    Nodo atras = LDE.lde.fin;
    Nodo adelante = LDE.lde.cab;

    @Override
    public void keyTyped(KeyEvent e) {
        // Este método se llama cuando una tecla se ha presionado y luego liberado.

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Este método se llama cuando una tecla se presiona.
        int tecla = e.getKeyCode();
        String input = JOptionPane.showInputDialog("Ingresa un valor:");
        if (input != null) {
            if (tecla==37){
                if (Integer.parseInt(input) == atras.dato){
                    System.out.println(" adivinaste la tecla"+tecla+" valor "+input+" index "+atras.index);
                }else {
                    System.out.println(" fallaste el valor es "+atras.dato+" index "+atras.index);
                }
                try {
                    atras = atras.ant;
                    if (atras == null){
                        throw new NullPointerException();
                    }
                }catch (NullPointerException a){
                    atras = LDE.lde.fin;
                    System.out.println("reinicio");
                }
                System.out.println("*".repeat(10));
                System.out.println("Presiona las flechas <- o ->");
            } else if (tecla==39) {
                if (Integer.parseInt(input) == adelante.dato){
                    System.out.println("adivinaste la tecla "+tecla+" valor "+input+" index "+adelante.index);
                }else {
                    System.out.println(" fallaste el valor es : "+adelante.dato+" index "+adelante.index);
                }
                try {
                    adelante = adelante.sig;
                    if (adelante == null){
                        throw new NullPointerException();
                    }
                }catch (NullPointerException s){
                    adelante = LDE.lde.cab;
                    System.out.println("reinicio");
                }
                System.out.println("*".repeat(10));
                System.out.println("Presiona las flechas <- o ->");
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}