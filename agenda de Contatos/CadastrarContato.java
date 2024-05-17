package agenda;

public class CadastrarContato {

	private String nome;
	private String telefone;
	private String email;

	public CadastrarContato(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Contato{" + "nome='" + nome + '\'' + ", telefone='" + telefone + '\'' + ", email='" + email + '\''
				+ '}';
	}
}
