package primer_programa;

public class Dados {
    private Integer tirar;


    public Dados() {

        this.tirar = 1 + (int)(Math.random() * ((6 - 1) + 1));
    }


    public Integer getLanzar() {
        return tirar;
    }

    public int lanzamiento() {
        System.out.println("\n Simulacion de Lanzamiento De Dados");
        System.out.println("\n Tirando Dados.....");
        double probabilidad_lanzar = Math.random();
        System.out.println("El numero que te ha salido es: " +tirar);
        System.out.println("\nSumando la lista de Resultados. ");

        return 0;
    }
}