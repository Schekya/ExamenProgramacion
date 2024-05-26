package model;

public final class TodoTerreno extends Coche{
    private int traccion;

    public TodoTerreno() {
    }

    public TodoTerreno(String marca, String modelo, String matricula, int cv, int cc, int precio, int traccion) {
        super(marca, modelo, matricula, cv, cc, precio);
        this.traccion = traccion;
    }

    public int getTraccion() {
        return traccion;
    }

    public void setTraccion(int traccion) {
        this.traccion = traccion;
    }

    @Override
    public void reprogramarMotor() {
        int aumentoCaballos = getCv() + ((getCv() * 10) / 100);
        setCv(aumentoCaballos);
    }

    @Override
    public String toString() {
        return "TodoTerreno " + super.toString() + ", traccion: " + getTraccion();
    }

}
