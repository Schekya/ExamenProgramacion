import model.Coche;
import model.Deportivo;
import model.TodoTerreno;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        ArrayList<Coche> listaCoches = new ArrayList<>();

        listaCoches.add(new Deportivo("Renault", "Rápido", "01245T", 100, 120, 14000, 120));
        listaCoches.add(new Deportivo("Megan", "Relámpago", "78451L", 200, 100, 6000, 80));
        listaCoches.add(new TodoTerreno("Toyota", "Monte", "14587K", 300, 50, 5000, 90));
        listaCoches.add(new TodoTerreno("Mercedes", "Playa", "20187P", 200, 80, 11500, 120));

        for (Coche coche : listaCoches) {
            coche.reprogramarMotor();
        }
        for (Coche coche: listaCoches) {
                System.out.println(coche.toString());
            }
        }



    }

