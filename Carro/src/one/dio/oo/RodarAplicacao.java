package one.dio.oo;

public class RodarAplicacao {
    public static void main(String[] args) {
        
        carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Gol");
        carro1.setCapacidadeTanque(45);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5,59));

        Carro carro2 = new Carro("Cinza", "Mercedez", 66);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6,59));
    }
}