package org.example;

import jdk.jfr.DataAmount;

import java.util.Arrays;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor


public class Departamento {
    private String nombre;
    private int numEmpleados;
    private Empleado[] empleados = new Empleado[2];
    void anadir(Empleado v){
        empleados[0]=v;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return numEmpleados == that.numEmpleados && Objects.equals(nombre, that.nombre) && Arrays.equals(empleados, that.empleados);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre, numEmpleados);
        result = 31 * result + Arrays.hashCode(empleados);
        return result;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", numEmpleados=" + numEmpleados +
                ", empleados=" + Arrays.toString(empleados) +
                '}';
    }

    public Departamento() {
        super();
    }
    
}



