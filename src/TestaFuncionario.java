
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario gordo = new Funcionario();
		gordo.setNome("Fabiano Teodoro");
		gordo.setSalario(1800);
		gordo.setCpf("311.348.708-09");
		
		System.out.println(gordo.getNome());
		System.out.println(gordo.getCpf());
		System.out.println(gordo.getSalario());
		System.out.println(gordo.getBonificacao());

	}

}
