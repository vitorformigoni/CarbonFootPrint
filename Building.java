package emissaocarbono;

public class Building implements CarbonFootprint {

    private double mediaMensalKwh; //consumação mensal de energia por hora
    private final int meses = 12;

    public Building(double consumoMensal) {
        mediaMensalKwh = consumoMensal;
    }

    public void setMediaMensalKwh(double consumoMensal) {
        mediaMensalKwh = consumoMensal;
    }

    public double getMediaMensalKwh() {
        return mediaMensalKwh;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", "Consumo mensal ", getMediaMensalKwh());
    }

    @Override
    public double getCarbonFootprint() {
        return getMediaMensalKwh() * meses;
    }
}
