
public class Conta {
	
	int id;
	double saldo;
	String nome;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		
		if (this.saldo - valor > 0) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if (this.saca(valor)) {
			destino.saldo += valor;
			return true;
		}
		
		return false;
		
	}

}
