public class NodoAnimal {

    // === Atributos ===
    private int codigo;
    private String raza;
    private double peso;
    private int edad;

    private NodoAnimal izquierdo;
    private NodoAnimal derecho;

    // === Constructor ===
    public NodoAnimal(int codigo,
                       String raza,
                       double peso,
                       int edad) {

        this.codigo = codigo;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;

        izquierdo = null;
        derecho = null;
    }

    // === Getters ===

    public int getCodigo() {
        return codigo;
    }

    public String getRaza() {
        return raza;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public NodoAnimal getIzquierdo() {
        return izquierdo;
    }

    public NodoAnimal getDerecho() {
        return derecho;
    }

    // === Setters ===

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setIzquierdo(NodoAnimal izquierdo) {
        this.izquierdo = izquierdo;
    }

    public void setDerecho(NodoAnimal derecho) {
        this.derecho = derecho;
    }
}
