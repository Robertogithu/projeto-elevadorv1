class Elevador{
  
  private String codigo;
  private int estado; //0,1,2, ou 3
  private int posicao; 
  private int totalrun; //historico de deslocamento


 public void inicializar(String codigo){
   if(this.estado == 0){
    this.codigo = codigo;
    this.posicao = 0;
    this.totalrun = 0;
   } else{
     System.out.println("(debug) falha!");
   }
 }
 
 public void ligar(){
    if(this.estado == 0)
      this.estado = 1;
    else{
     System.out.println("(debug) falha operação ilegal !");
   }
}

 public void desligar(){
if(this.estado == 1 && this.posicao == 0)
      this.estado = 0;
    else{
     System.out.println("(debug) falha operação ilegal !");
   }
 }

 public void mover(int destino){
    
    if(this.estado == 1 && destino > 0){
    this.posicao = destino;
    } else {
      System.out.println("(debug) falha operação ilegal !");
    }


 }

 public int getPosicao(int novaposicao){
   return this.posicao + novaposicao;
 }
 public int getTotalRun(){
   return this.totalrun;
 }
 public String getCodigo(){
   return this.codigo;
 }
 

}