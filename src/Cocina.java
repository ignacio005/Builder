public class Cocina {
    private SandwichBuilder sandwichBuilder;

    public SandwichBuilder getSandwichBuilder() {
        return sandwichBuilder;
    }

    public void setSandwichBuilder(SandwichBuilder sandwichBuilder) {
        this.sandwichBuilder = sandwichBuilder;
    }

    public void hacerSandwich(){
        sandwichBuilder.crearNuevoSandwich();
        sandwichBuilder.pan();
        sandwichBuilder.relleno();
    }
}
