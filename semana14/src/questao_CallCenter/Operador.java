package questao_CallCenter;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Operador  {
    private int id;
    private Semaphore semaforo;

    public Semaphore getSemaforo() {
        return semaforo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Operador(int id) {
        this.id = id;
        semaforo = new Semaphore(1);
    }

    public void atender(Cliente c){
        try {
            semaforo.acquire();
            System.out.println("questao_CallCenter.Operador " + id +  " Iniciando atendimento ao cliente:"+ c.getId_c());
            Random rng = new Random();
            Thread.sleep(rng.nextInt(4000)+1000);
            semaforo.release();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }



}

