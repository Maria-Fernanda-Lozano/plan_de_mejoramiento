package davi_plata;

public class depositar {
    private int plata_total=300000;
    private int plata_depositada;
    public depositar(int plata_total, int plata_depositada) {
        this.plata_total = plata_total;
        this.plata_depositada = plata_depositada;
    }
    public int getPlata_total() {
        return plata_total;
    }
    public void setPlata_total(int plata_total) {
        this.plata_total = plata_total;
    }
    public int getPlata_depositada() {
        return plata_depositada;
    }
    public void setPlata_depositada(int plata_depositada) {
        this.plata_depositada = plata_depositada;
    }
    
    
}
