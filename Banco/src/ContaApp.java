
public class ContaApp {

	public static void main(String[] args) {
		
		Conta contaCelina = new Conta();
		contaCelina.deposita(1000);
		System.out.println(contaCelina.saldo);
		
		Conta contaAilton = new Conta();
		contaAilton.deposita(2000);
		System.out.println(contaAilton.saldo);
		
		contaAilton.saca(500);
		System.out.println(contaAilton.saldo);
		
		contaAilton.transfere(200, contaCelina);
		System.out.println(contaCelina.saldo);
		System.out.println(contaAilton.saldo);

	}

}
