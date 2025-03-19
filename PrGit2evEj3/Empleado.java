package org.example;

@Getter
@Setter
@ToString

public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sueldo=" + sueldo +
                '}';
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
void incrimentarEdad(){ edad+1;}
}
