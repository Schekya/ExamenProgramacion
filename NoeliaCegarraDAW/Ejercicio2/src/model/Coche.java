package model;

public abstract class Coche {
    private String marca, modelo, matricula;
    private int cv, cc, precio;

    public Coche() {
    }
    public Coche(String marca, String modelo, String matricula, int cv, int cc, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.cc = cc;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return
                "marca: '" + marca + '\'' +
                ", modelo: '" + modelo + '\'' +
                ", matricula: '" + matricula + '\'' +
                ", cv: " + cv +
                ", cc: " + cc +
                ", precio: " + precio;
    }

    public void reprogramarMotor(){};
}
