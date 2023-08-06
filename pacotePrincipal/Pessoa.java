package pacotePrincipal;

public class Pessoa{
    public String nome;
    private int dataNascimento;
    private int cpf;
    private String email;
    private String estado;


    //Modificadores de nome
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome1){
        this.nome = nome1;
        
    }
//mokdificadores de data de nasciento
    public int getDataNascimento(){
        return this.dataNascimento;
    }
    
    public void setDataNascimento(int data){
        this.dataNascimento = data;
        
    }
    
    //modificadores de CPF
    public int getCPF(){
        return this.cpf;
    }

    public void setCPF(int CPF){
        this.cpf = CPF;
    }
    
// modificador de email.  
    public String getEmail() {
            return email;
        }
    public void setEmail(String email) {
        this.email = email;
    }
//modificador de estado
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;

}


}