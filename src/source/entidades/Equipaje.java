
package source.entidades;


public class Equipaje {
    private double peso;
    private String tipo;

    public Equipaje(double peso, String tipo) {
        this.peso = peso;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
