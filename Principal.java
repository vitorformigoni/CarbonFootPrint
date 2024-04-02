package emissaocarbono;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList< CarbonFootprint> carbonfootprint = new ArrayList< CarbonFootprint>();
        carbonfootprint.add(new Bicycle(300.00));
        carbonfootprint.add(new Building(5000.52));
        carbonfootprint.add(new Car(10000.00, 10.5));
        
        System.out.println("Dados dos objetos: ");

        for (CarbonFootprint currentObject : carbonfootprint) {
            System.out.printf("\n%s: %s \n%s %s: %.2f\n",
                    "Detalhes sobre ", currentObject.getClass().getName(),
                    currentObject.toString(),
                    "\nCarbon footprint ", currentObject.getCarbonFootprint());
        }
    }
}
