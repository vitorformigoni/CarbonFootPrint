package emissaocarbono;

public class Car implements CarbonFootprint {

    private double KilometrosAnuais;
    private double mediaKmPorLitro; //media de Kilometros por litro
    private final int kgCO2Porkilometro = 9; //kilogramas de dioxido de carbono por kilometro

    public Car(double kilometros, double KmPorLitro) {
        KilometrosAnuais = kilometros;
        mediaKmPorLitro = KmPorLitro;
    }

    public void setKilometrosAnuais(double kilometros) {
        KilometrosAnuais = kilometros;
    }

    public void setmediaKmPorLitro(double KmPorLitro) {
        mediaKmPorLitro = KmPorLitro;
    }

    public double getKilometrosAnuais() {
        return KilometrosAnuais;
    }

    public double getMediaKmPorLitro() {
        return mediaKmPorLitro;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f \n%s: %.2f ",
                "Media anual de kilometros ", getKilometrosAnuais(),
                "Media de Kilometro por litro ", getMediaKmPorLitro());
    }

    @Override
    public double getCarbonFootprint() {
        return ((getKilometrosAnuais() * getMediaKmPorLitro()) * kgCO2Porkilometro);

    }

}
