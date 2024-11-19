public class Main {
    public static void main(String[] args) {
        // Creo direcctor y constructores
        Cocina cocina = new Cocina(); // Aunque no hay un constructor se crea por defecto.
        SandwichBuilder sandwichBuilderPollo = new SandwichBuilderPollo();
        SandwichBuilder sandwichBuilderMixto = new SandwichBuilderMixto();
        SandwichBuilder sandwichBuilderVegetal = new SandwichBuilderVegetal();

        cocina.setSandwichBuilder(sandwichBuilderPollo); // Escoge el constructor
        cocina.hacerSandwich(); // Dirige el proceso
        System.out.println("Sándwich hecho de " + cocina.getSandwichBuilder().getSandwich().getPan() + " Y " + cocina.getSandwichBuilder().getSandwich().getRelleno());

        cocina.setSandwichBuilder(sandwichBuilderVegetal);
        cocina.hacerSandwich();
        System.out.println("Sándwich hecho de " + cocina.getSandwichBuilder().getSandwich().getPan() + " Y " + cocina.getSandwichBuilder().getSandwich().getRelleno());
    }
}