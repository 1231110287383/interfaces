public class perro extends animal implements mascota {
    private int edad;
    private String nombrePerro;
    private String raza;

    public perro(String tipo, String nombre, int edad, String nombrePerro, String raza) {
        super(tipo, nombre);
        this.edad = edad;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
    }

    @Override
    public void comer() {
        System.out.println("el perro come de su plato...");
    }

    @Override
    public void respirar() {
        System.out.println("el perro respira solo...");
    }

    @Override
    public void bañar() {
        System.out.printf("bañando a "+this.nombrePerro);
    }

    @Override
    public void vacunar() {
        System.out.println("vacunando a "+this.nombrePerro);
    }
}
