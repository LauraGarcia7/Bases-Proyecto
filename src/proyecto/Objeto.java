package proyecto;

import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Labing
 */
public class Objeto implements Comparable<Objeto> {
    //Fecha, Ubicacion, Coordenadas, EmpresaContratante, ID
//private Calendar fecha;

    private int longitud, latitud, id;
    private String empresaContratante, ubicacion, fecha;

    public Objeto() {
    }

    public Objeto(int id, String fecha, int longitud, int latitud, String empresaContratante, String ubicacion) {
        this.fecha = fecha;
        this.longitud = longitud;
        this.latitud = latitud;
        this.id = id;
        this.empresaContratante = empresaContratante;
        this.ubicacion = ubicacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresaContratante() {
        return empresaContratante;
    }

    public void setEmpresaContratante(String empresaContratante) {
        this.empresaContratante = empresaContratante;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return this.getId() + "  -  " + this.getFecha() + "  -  " + this.getUbicacion() + "  -  " + this.getLatitud() + "  -  " + this.getLongitud() + "  -  " + this.getEmpresaContratante();
    }

    public int compare(Objeto p1, Objeto p2) {
        return new Integer(p1.getId()).compareTo(new Integer(p2.getId()));
    }

    @Override
    public int compareTo(Objeto o) {
        return new Integer(this.getId()).compareTo(new Integer(o.getId()));
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
