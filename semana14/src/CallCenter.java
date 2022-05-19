import java.util.Random;
import java.util.concurrent.Semaphore;

public class CallCenter  {
    private Operador op1;
    private Operador op2;
    private Operador op3;
    private Operador op4;
    private Operador op5;

    public CallCenter(){
         op1 = new Operador(1);
         op2 = new Operador(2);
         op3 = new Operador(3);
         op4 = new Operador(4);
         op5 = new Operador(5);
    }
    public void avaible(Cliente c){

        if(op1.getSemaforo().getQueueLength() <= 0)op1.atender(c);
        else if (op2.getSemaforo().getQueueLength() <= 0)op2.atender(c);
        else if (op3.getSemaforo().getQueueLength() <= 0)op3.atender(c);
        else if (op4.getSemaforo().getQueueLength() <= 0)op4.atender(c);
        else if (op5.getSemaforo().getQueueLength() <= 0)op5.atender(c);
        else{
            System.out.println("Cliente "+c.getId_c()+" esta aguardando na fila!");
            Random r = new Random();
            switch (r.nextInt(4)) {
                case 0 -> op1.atender(c);
                case 1 -> op2.atender(c);
                case 2 -> op3.atender(c);
                case 3 -> op4.atender(c);
                case 4 -> op5.atender(c);
            }
        }//else

    }
}
