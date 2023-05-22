package ar.edu.unlam.pb2.contadorGanado;

public class ContadorDeGanado {

	private int min;
	private int max;
	private int valor_actual;
	
	
	public ContadorDeGanado() {
		this.min = 0;
		this.max = 999;
		this.valor_actual = 0;
		
	}
	
	public void cuenta(int cantidadSuma) {
		if(this.valor_actual<= this.max) {
			this.valor_actual = this.valor_actual + cantidadSuma;
		}else {
			this.valor_actual=0;
		}
	}
	
	public void reset (boolean resetea) {
		if(resetea) {
			this.valor_actual=0;
		}
	}
	
	public int getValorActual() {
		return valor_actual;
	}
}
