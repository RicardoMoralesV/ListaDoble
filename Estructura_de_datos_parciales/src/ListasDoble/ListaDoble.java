package ListasDoble;



public class ListaDoble {
	private musica cabeza;
	
	public ListaDoble() {
		this.cabeza=null;
	}
	public musica getCabeza() {
		return cabeza;
	}
	public void setCabeza(musica cabeza) {
		this.cabeza = cabeza;
	}
	
	public boolean vacio(){
		boolean respuesta=true;
		if(this.cabeza!=null){
			respuesta=false;
		}
		return respuesta;
	}
	 public void insertar(NodoDoble valor){
		 
		 musica  nuevo= new musica();
		 nuevo.setValor(valor);
		 nuevo.setSiguiente(null);
		 nuevo.setAnterior(null);
		 this.cabeza=nuevo;
	 }
	 
	 
	public void insertarnodoadelante(NodoDoble valor)
	{
		if(vacio()){
			insertar(valor);
		}
		else{
			musica nuevo=new musica();
			nuevo.setValor(valor);
			nuevo.setSiguiente(this.cabeza);
			this.cabeza.setAnterior(nuevo);
			nuevo.setAnterior(null);
			this.cabeza=nuevo;
		}
	}
	

}
