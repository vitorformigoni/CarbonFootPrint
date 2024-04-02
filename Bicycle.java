package emissaocarbono;

public class Bicycle implements CarbonFootprint {

    private double KilometroAno;
    private final int caloriasPorKilometro = 34; //calorias gastas por kilometro

    public Bicycle(double kilometro) {
        KilometroAno = kilometro;
    }

    public void setKilometroAno(double kilometro) {
        KilometroAno = kilometro;
    }

    public double getKilometroAno() {
        return KilometroAno;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", "Kilometros por Ano ", getKilometroAno());
    }

    @Override
    public double getCarbonFootprint() {
        return KilometroAno * caloriasPorKilometro;
    }

}
