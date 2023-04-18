package davi_plata;
import java.util.Scanner;

public class ejecutar {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String nombre_usuario;
        int contraseña=0;
        int opcion=1;
        int volver=1;
        int num_tel, valor_recarga;
        int plata_retirada,plata_restante,plata=10000;
        int plata_total=300000;
        int plata_depositada;
        int saldo=30000;
        ingresar ingresar=new ingresar(null, contraseña);
        System.out.println("ingrese su nombre de usuario");
        nombre_usuario=leer.next();
        System.out.println("digite la contraseña");
        contraseña=leer.nextInt();

        ingresar.iniciar();

        while (volver==1) {
            System.out.println("escoja alguna de las siguientes opciones 1=recargar, 2=retirar, 3=depositar, 4=consultar");
            opcion=leer.nextInt();
            switch (opcion){
                case 1:
                System.out.println("igrese nuemrode telefono");
                num_tel=leer.nextInt();
                System.out.println("ingrese el valor de la recarga");
                valor_recarga=leer.nextInt();
                System.out.println("la recarge fue un exito: total:" +valor_recarga);
                System.out.println("su numero de telefono es: " +num_tel);
                break;
                case 2:
                System.out.println("cuanto quiere retirar");
                plata_retirada=leer.nextInt();
                plata_restante=plata-plata_retirada;
                System.out.println("total: "+plata_restante);
                break;
                case 3:
                System.out.println("cuanto quiere depositar: ");
                plata_depositada=leer.nextInt();
                int Total=0;
                Total=plata_depositada+plata_total;
                System.out.println("total: "+Total);
                break;
                case 4:
                System.out.println("consulte su dinero");
                System.out.println("saldo: "+saldo);
                break;
                
             }


            
        }
        leer.close();
    }
}
