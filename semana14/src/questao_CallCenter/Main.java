package questao_CallCenter;

public class Main {
    public static void main(String[] args) {

        CallCenter c = new CallCenter();
        Cliente c1 = new Cliente(1,c);
        Cliente c2 = new Cliente(2,c);
        Cliente c3 = new Cliente(3,c);
        Cliente c4 = new Cliente(4,c);
        Cliente c5 = new Cliente(5,c);
        Cliente c6 = new Cliente(6,c);
        Cliente c7 = new Cliente(7,c);
        Cliente c8 = new Cliente(8,c);
        Cliente c9 = new Cliente(9,c);
        Cliente c10 = new Cliente(10,c);
        Cliente c11= new Cliente(11,c);
        Cliente c12 = new Cliente(12,c);
        Cliente c13 = new Cliente(13,c);
        Cliente c14 = new Cliente(14,c);
        Cliente c15 = new Cliente(15,c);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
        c10.start();
        c11.start();
        c12.start();
        c13.start();
        c14.start();
        c15.start();

    }
}
