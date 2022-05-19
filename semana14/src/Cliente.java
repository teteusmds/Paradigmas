public class Cliente extends Thread {
    private int id_c;
    private CallCenter cc;

    public int getId_c() {
        return id_c;
    }

    public void setId(int id_c) {
        this.id_c = id_c;
    }

    public Cliente(int id_c ,  CallCenter cc) {
        this.id_c = id_c;
        this.cc = cc;
    }

    @Override
    public void run() {
     ;
        while (true){
            try {
                cc.avaible(this);
                sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
