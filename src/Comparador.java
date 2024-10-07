public class Comparador {

    public String nombre;

    public Comparador(){

    }

    public void mayorDeTres(int a, int b, int c){
        if (a > b && a > c){
            System.out.println(a +" es el número más grande ");
        } else if (b > a && b > c){
            System.out.println(b +" es el número más grande ");
        } else if (c > a && c > b){
            System.out.println(c +" es el número más grande ");
        }
    }
}
