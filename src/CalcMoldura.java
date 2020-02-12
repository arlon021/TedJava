
public class CalcMoldura {
	private Retangulo retEsterno;
	private Retangulo retInterno;
	
	
	public CalcMoldura(Retangulo ri, Retangulo re) {
		this.retEsterno = re;
		this.retInterno = ri;
		
		
	}
	 
	public float calcularMoldura() {
		
		return(retEsterno.calcularArea() - retInterno.calcularArea());
	}
	
}
