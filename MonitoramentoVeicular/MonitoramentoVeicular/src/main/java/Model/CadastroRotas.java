package Model;

import jakarta.persistence.*;


import java.io.Serializable;

@Entity
@SequenceGenerator(name = "rotas", sequenceName = "rotas", initialValue = 1,allocationSize = 1)
public class CadastroRotas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rotas")
    private Integer id;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private String estado;
    @Column(nullable = false)
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
