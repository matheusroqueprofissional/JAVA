
//!criaremos um timer utilizando java
package pl01;



public class main {

	public static void main(String[] args) throws InterruptedException
	{
		int segundos, minutos, horas;
        segundos = 60;
        minutos = 61;
        horas = 24;
        System.out.println("segundos: "+segundos);
        
        while(horas !=0) {
        	minutos = 60;
        	horas --;
        	System.out.println(" | horas: "+horas+" | minutos: "+minutos+" | segundos: "+segundos+"|");

        while(minutos !=0) {
        	segundos =59;
        	minutos --;
        	System.out.println(" | horas: "+horas+" | minutos: "+minutos+" | segundos: "+segundos+"|");
        while(segundos !=0) {
        	try {
        	    Thread.sleep(1000); // 1000 milissegundos = 1 segundo
        	} catch (InterruptedException e) {
        	    // Tratar a exceção, se necessário
        	}
        	segundos --;
        	System.out.println(" | horas: "+horas+" | minutos: "+minutos+" | segundos: "+segundos+"|");
        	
            
        }}}
     System.out.println("|========================================|");
     System.out.println("cronometro finalizado");
	}
}
