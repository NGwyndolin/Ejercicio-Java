/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VehiculoPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[12];
        vehiculos[0] = new Vehiculo("1111-CBH", "OPEL", 15364.68, 51000);
        vehiculos[1] = new Vehiculo("3333-STV", "HONDA", 27694.36, 45000);
        vehiculos[2] = new Vehiculo("5000-LBC", "OPEL", 57388.30, 75000);
        vehiculos[3] = new Vehiculo("2222-VTS", "PEUGEOT", 33555.75, 83000);
        vehiculos[4] = new Vehiculo("1211-LMT", "OPEL", 28969.42, 95000);
        vehiculos[5] = new Vehiculo("8887-CLT", "HONDA", 18666.36, 150000);
        vehiculos[6] = new Vehiculo("5569-BJT", "PEUGEOT", 31254.45, 33300);
        vehiculos[7] = new Vehiculo("3658-CHK", "MERCEDES", 78145.83, 41960);
        vehiculos[8] = new Vehiculo("6666-KLU", "FORD", 32145.99, 22015);
        vehiculos[9] = new Vehiculo("2698-MTL", "OPEL", 22478.25, 54782);
        vehiculos[10] = new Vehiculo("1111-ZTR", "OPEL", 1536.68, 61000);
        vehiculos[11] = new Vehiculo("1111-ZTR", "ABRA", 1536.68, 50000);
        ArrayList<Vehiculo> listaTodosVehiculos = new ArrayList<>();
        for (int i = 0; i < vehiculos.length; i++) {
            listaTodosVehiculos.add(vehiculos[i]);
        }

        //A
        System.out.println("Vehiculos 50k km o mas, ordenado por marca");
        Predicate<Vehiculo> filtroA = o -> o.getKilometros() >= 50000;
        ArrayList<Vehiculo> menosCincuenta = new ArrayList<>();
        Comparator<Vehiculo> ordenarMarca = (a, b)
                -> {
            if ((b.getMarca().compareTo(a.getMarca())) < 0) {
                return 1;
            } else {
                return -1;
            }
        };
        menosCincuenta = listaTodosVehiculos.stream().sorted(ordenarMarca).filter(filtroA).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(menosCincuenta);
        
        //B
        
        System.out.println("Añadimos dos elementos a la lista");
        Vehiculo v1 = new Vehiculo("1190-ART", "SIGMA", 10536.68, 10000);
        Vehiculo v2 = new Vehiculo("1120-BTR", "RENAULT", 20536.12, 0);
        listaTodosVehiculos.add(v1);
        listaTodosVehiculos.add(v2);
        System.out.println("Que matricula quieres ver:");
        Scanner sc = new Scanner(System.in);
        String matricula = sc.nextLine();
        Vehiculo vehiculo = new Vehiculo(matricula);
        Iterator <Vehiculo> it = listaTodosVehiculos.iterator();
        while(it.hasNext()){
            Vehiculo vehiculoDos = it.next();
            if(vehiculo.equals(vehiculoDos)){
                System.out.println("Estos son los datos del vehiculo:");
                System.out.println(vehiculoDos);
            }
        }
        //C
        System.out.println("Opel mas de 60k km segun orden natural(kms)");
        ArrayList<Vehiculo> opelSesenta = new ArrayList<>();
        Predicate<Vehiculo> filtroC = o -> o.getKilometros() > 60000 && o.getMarca().equals("OPEL");
        listaTodosVehiculos.stream().filter(filtroC).sorted().forEach(o -> System.out.println(o));

        //D
        int sumaKilometros = listaTodosVehiculos.stream().mapToInt(k -> k.getKilometros()).sum();
        System.out.println("La suma de los kilometros es: " + sumaKilometros);
        
        //E
        System.out.println("Array de matriculas:");
        String[]arrayMatriculas = new String[vehiculos.length];
        for(int j = 0; j < vehiculos.length; j++){
            arrayMatriculas[j] = vehiculos[j].getMatricula();
            System.out.println(arrayMatriculas[j]);
        }
        
    }

}
