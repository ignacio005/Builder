public class SandwichBuilderVegetal extends SandwichBuilder{
    @Override
    public void pan() {
        sandwich.setPan("Pan Integral.");
    }

    @Override
    public void relleno() {
        sandwich.setRelleno("Lechuga, tomate, bonito, huevo cocido y espárragos.");
    }
}
