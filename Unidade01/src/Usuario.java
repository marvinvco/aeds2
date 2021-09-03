
public class Usuario {
	private int codigo;
	private String senha;
	private String login;
	private char sexo;
	
	public Usuario() {
		this.codigo = -1;
		this.senha = "";
		this.login = "";
		this.sexo = '*';
	}
	
	public Usuario(int codigo, String login, String senha, char sexo) {
		this.codigo = codigo;
		this.senha = senha;
		this.login = login;
		this.sexo = sexo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", senha=" + senha + ", login=" + login + ", sexo=" + sexo + "]";
	}
}