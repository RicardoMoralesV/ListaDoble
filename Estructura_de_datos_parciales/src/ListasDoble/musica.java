package ListasDoble;

public class musica {

	private  NodoDoble valor;
	private musica siguiente;
	private musica anterior;
	
	public NodoDoble getValor() {
		return valor;
	}
	public void setValor(NodoDoble valor) {
		this.valor = valor;
	}
	public musica getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(musica siguiente) {
		this.siguiente = siguiente;
	}
	public musica getAnterior() {
		return anterior;
	}
	public void setAnterior(musica anterior) {
		this.anterior = anterior;
	}
	
	
}
