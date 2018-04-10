 
public class Aplicacion {
    public static void main(String[] args) {
        Forma figura = new Paralelogramo();
        figura.mostrar();
        Forma texto = new AdaptadorT(new Texto());
        texto.mostrar();
    }
}