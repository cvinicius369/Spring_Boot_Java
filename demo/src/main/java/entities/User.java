package entities;
import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "tb_user")

public class User implements Serializable{
	// atributos
	private long id;
	private String nome;
	private String email;
	private String telefone;
	private String password;
	
	// construtor da classe
	public User(){
		// vazio
	}
	public User(Long id, String nome, String email, String telefone, String password) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.password = password;
    }
	
	//get set
	public Long getId() { return id; } public void setId(int id) {this.id = id;}
	public String getNome() {return nome; } public void setNome(String nome) {this.nome = nome;}
	public String getEmail() {return email;} public void setEmail(String email) {this.email = email;}
	public String getTelefone() {return telefone;} public void setTelefone(String telefone) {this.telefone = telefone;}
	public String getPassword() {return password;} public void setPassword(String password) {this.password = password;}
	
	// hashCode and Equals
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;	
		result = prime * result + (int) (id ^ (id >>> 32));
	    result = prime * result + ((email == null) ? 0 : email.hashCode());
	    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	    result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
	    result = prime * result + ((password == null) ? 0 : password.hashCode());
	    return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
	    if (obj == null) return false;
	    if (getClass() != obj.getClass()) return false;
	    User other = (User) obj;
	    if (id != other.id) return false;
	    if (email == null) {
	        if (other.email != null) return false;
	    } else if (!email.equals(other.email)) return false;
	    if (nome == null) {
	        if (other.nome != null) return false;
	    } else if (!nome.equals(other.nome)) return false;
	    if (telefone == null) {
	        if (other.telefone != null) return false;
	    } else if (!telefone.equals(other.telefone)) return false;
	    if (password == null) {
	        if (other.password != null) return false;
	    } else if (!password.equals(other.password)) return false;
	    return true;
	}
}
