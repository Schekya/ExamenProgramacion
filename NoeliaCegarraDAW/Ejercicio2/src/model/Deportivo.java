package model;

import org.w3c.dom.ls.LSOutput;

public final class Deportivo extends Coche {
    private int par;

    public Deportivo() {
    }

    public Deportivo(String marca, String modelo, String matricula, int cv, int cc, int precio, int par) {
        super(marca, modelo, matricula, cv, cc, precio);
        this.par = par;
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }

    @Override
    public void reprogramarMotor() {
        int aumentoCaballos = getCv() + ((getCv() * 25) / 100);
        setCv(aumentoCaballos);
    }

    @Override
    public String toString() {
        return "Deportivo " + super.toString() + ", par: " + getPar();
    }
}
