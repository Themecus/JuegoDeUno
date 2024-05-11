public class CartaBlanca {

   private int contadorCarta=0;
   private String color;

    public CartaBlanca( int contadorCarta, String color) {

        this.contadorCarta = contadorCarta;
        this.color = color;
    }

    public CartaBlanca() {

    }





    public int getContadorCarta() {
        return contadorCarta;
    }

    public void setContadorCarta(int contadorCarta) {
        this.contadorCarta = contadorCarta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
