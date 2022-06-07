/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Objects;

public class Vehiculo implements Comparable{
    private String matricula;
    private String marca;
    private double precio;
    private int kilometros;
    
    public Vehiculo(String matricula, String marca,double precio, int kilometros){
        this.matricula=matricula;
        this.marca=marca;
        this.precio=precio;
        this.kilometros=kilometros;
    }
    public Vehiculo(String matricula){
        this.matricula = matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getKilometros() {
        return kilometros;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.matricula, other.matricula);
    }

    @Override
    public int compareTo(Object o) {
        return this.getKilometros()-((Vehiculo)o).getKilometros();
    }
    
    @Override
    public String toString(){
        String vehiculo = "Matricula: " + this.getMatricula()
                +"\nMarca: " +this.getMarca()
                +"\nPrecio: " +this.getPrecio()
                +"\nKilometros: " +this.getKilometros()+"\n";
        return vehiculo;
    }
}
