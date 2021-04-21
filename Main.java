class Main {
  public static void main(String[] args) 
  {
    
    Elevador elevador = new Elevador();


    elevador.inicializar("TORRE01");


    System.out.println("NOME: " + elevador.getCodigo());
    System.out.println("ANDAR -->" + elevador.getPosicao());

    elevador.mover(7);
    System.out.println("\nnome: "+ elevador.getCodigo() + "["+ elevador.getTotalRun() +"]");
    System.out.println("parado no andar -->" + elevador.getPosicao());
                                                 
    elevador.mover(12);
    System.out.println("\nnome: "+ elevador.getCodigo() + "["+ elevador.getTotalRun() +"]");
    System.out.println("parado no andar -->" + elevador.getPosicao());
    
    elevador.mover(3);
    System.out.println("\nnome: "+ elevador.getCodigo() + "["+ elevador.getTotalRun() +"]");
    System.out.println("parado no andar -->" + elevador.getPosicao());
    
    elevador.mover(0);
    System.out.println("\nnome: "+ elevador.getCodigo() + "["+ elevador.getTotalRun() +"]");
    System.out.println("parado no andar -->" + elevador.getPosicao());
    
    elevador.desligar();
    elevador.inicializar("TOWER EST");

    
    System.out.println("\nnome: "+ elevador.getCodigo() + "["+ elevador.getTotalRun() +"]");
    System.out.println("Parado no andar --> " + elevador.getPosicao());
    

    System.out.println("fim de teste");

    
  }
}