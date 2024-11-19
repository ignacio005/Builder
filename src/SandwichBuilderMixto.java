public class SandwichBuilderMixto extends SandwichBuilder{
    @Override
    public void pan() {
        sandwich.setPan("Pan Bimbo.");
    }

    @Override
    public void relleno() {
        sandwich.setRelleno("Jamón york, queso y huevo frito.");
    }

}
