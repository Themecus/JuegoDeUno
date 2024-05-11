import java.util.LinkedList;

public class ControlCartas {
    LinkedList<CartaBlanca> mazo = new LinkedList<CartaBlanca>();

    public void crearCartas() {
        crearAmarillas();
        crearAzules();
        crearRojas();
        crearVerdes();
    }

    public void crearAmarillas()
    {
        int contador = 1;
        int numeros = 19;

        while (contador != numeros) {
            CartaBlanca cartaAgregable= new CartaBlanca();

            cartaAgregable= new CartaAmarrila();

            cartaAgregable.setContadorCarta(contador);
            cartaAgregable.setColor("Amarillo");
            guardarCartas(cartaAgregable);
            contador++;
        }

    }

    public void crearAzules()
    {
        int contador = 19;
        int numeros = 38;

        while (contador != numeros) {
            CartaBlanca cartaAgregable= new CartaBlanca();

            cartaAgregable= new CartaAmarrila();

            cartaAgregable.setContadorCarta(contador);
            cartaAgregable.setColor("Azul");
            guardarCartas(cartaAgregable);
            contador++;
        }

    }

    public void crearRojas()
    {
        int contador = 38;
        int numeros = 57;

        while (contador != numeros) {
            CartaBlanca cartaAgregable= new CartaBlanca();

            cartaAgregable= new CartaAmarrila();

            cartaAgregable.setContadorCarta(contador);
            cartaAgregable.setColor("Rojas");
            guardarCartas(cartaAgregable);
            contador++;
        }

    }

    public void crearVerdes()
    {
        int contador = 57;
        int numeros = 76;

        while (contador != numeros) {
            CartaBlanca cartaAgregable= new CartaBlanca();

            cartaAgregable= new CartaAmarrila();

            cartaAgregable.setContadorCarta(contador);
            cartaAgregable.setColor("Verdes");
            guardarCartas(cartaAgregable);
            contador++;
        }

    }

    public void guardarCartas(CartaBlanca cartasVarias)
    {
        mazo.add(cartasVarias);

    }
    public void verMazo() {
        int contador = 0;
        int stop = mazo.size();

        while (contador != stop) {
            System.out.println(mazo.get(contador).getContadorCarta()+" "+mazo.get(contador).getColor());
            contador++;
        }


    }
}
