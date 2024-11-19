public abstract class SandwichBuilder {
    public Sandwich sandwich; // Le pongo de tipo Sandwich para acceder a los metodos de la clase Sandwich.
    // Para crear objeto sin constructor
    public void crearNuevoSandwich(){
        sandwich = new Sandwich();
    }

    public Sandwich getSandwich() {
        return sandwich;
    }

    public abstract void pan();
    public abstract void relleno();

}
