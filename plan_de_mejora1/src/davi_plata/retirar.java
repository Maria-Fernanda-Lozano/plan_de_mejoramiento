package davi_plata;
public class retirar {
    private int total_plata=100000;
private int plata_retirada,plata_restante;
public retirar(int total_plata, int plata_retirada, int plata_restante) {
    this.total_plata = total_plata;
    this.plata_retirada = plata_retirada;
    this.plata_restante = plata_restante;
}
public int getTotal_plata() {
    return total_plata;
}
public void setTotal_plata(int total_plata) {
    this.total_plata = total_plata;
}
public int getPlata_retirada() {
    return plata_retirada;
}
public void setPlata_retirada(int plata_retirada) {
    this.plata_retirada = plata_retirada;
}
public int getPlata_restante() {
    return plata_restante;
}
public void setPlata_restante(int plata_restante) {
    this.plata_restante = plata_restante;
}


    
}
