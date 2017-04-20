package primer_programa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Dados> lista_dados = new ArrayList<Dados>();

        while(true) {
            int opcion = 0;

            System.out.println("\n Simulacion De Dados");
            System.out.println("1. Lanzamiento");
            System.out.println("2. Tus Resultados");
            System.out.println("3. Salida");

            try {
                System.out.print("OPCION: ");
                opcion = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.err.println("ERROR: Opción es inválida.");
            }

            switch (opcion) {
                case 1:
                    Dados d = new Dados();
                    int estado = d.lanzamiento();

                    if (estado == 0)
                        lista_dados.add(d);
                    break;
                case 2:
                    if (lista_dados.size() == 0)
                        System.out.println("Ud no realizo lanzamiento ");
                    else System.out.println("\n Mostrando Resultados: "); {for (Dados dd : lista_dados) {

                    System.out.println(Math.round(dd.getLanzar()));
                }
                }
                break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR: Opción es inválida");
            }
        }
    }
}