public class SandwichBuilderPollo extends SandwichBuilder{
    @Override
    public void pan() {
        sandwich.setPan("Pan Bimbo.");
    }

    @Override
    public void relleno() {
        sandwich.setRelleno("Pollo, lechuga y tomate.");
    }
}
