package com.smoowy.realmtest;

import java.util.ArrayList;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;

public class MonieDB extends RealmObject {

    public int id;
    public String resultado;
    public String fecha;
    public String dineroLetra = "1000 500 200 100 50 20 10 5 2 1 .50 .20 .10";
    public String dineroCantidad;
    public String dineroResultado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDineroLetra() {
        return dineroLetra;
    }

    public void setDineroLetra(String dineroLetra) {
        this.dineroLetra = dineroLetra;
    }

    public String getDineroCantidad() {
        return dineroCantidad;
    }

    public void setDineroCantidad(String dineroCantidad) {
        this.dineroCantidad = dineroCantidad;
    }

    public String getDineroResultado() {
        return dineroResultado;
    }

    public void setDineroResultado(String dineroResultado) {
        this.dineroResultado = dineroResultado;
    }

    public MonieDB() {


    }


}