package algoritmo2;

public class atv {
    public static void main(String[] args) {
            int totalTempo = 2;
            int inicioTempo = 0;
            while (inicioTempo <= totalTempo) {
                try {
                    System.out.println("Assistindo ao filme... inicioTempo: " +inicioTempo);
                    Thread.sleep(60000);
                    inicioTempo++;
                } catch(InterruptedException e){
                    System.out.println("Ops, houve algum erro..." + e);
                }
            }
            System.out.println("Fim do filme...");
        }
        

    }

