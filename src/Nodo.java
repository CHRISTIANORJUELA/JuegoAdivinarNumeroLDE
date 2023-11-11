public class Nodo {
    int dato;
    Nodo sig;
    Nodo ant;

    int index;

    public Nodo(int dato,int index){
        this.dato = dato;
        this.index = index;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", ant=" + ant +
                ", sig=" + sig +
                '}';
    }
}
