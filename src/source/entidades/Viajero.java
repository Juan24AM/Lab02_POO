package source.entidades;

public class Viajero {
    private String nombre;
    private String sexo;

    public Viajero(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void viajar(double pesoEquipaje, String tipoEquipaje){
        Equipaje eq = new Equipaje(pesoEquipaje, tipoEquipaje);
        System.out.println(String.format("El viajero %s, lleva su equipaje de tipo %s, el cual pesa %.2f", nombre, eq.getTipo(), eq.getPeso()));
    }
}
