package ifpb.ads.emprestimo;

import ifpb.ads.livro.Livro;
import java.time.LocalDate;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 17/06/2017, 12:28:50
 */
public class Emprestimo {

    private LocalDate dataDoEmprestimo;
    private String nomeDoCliente;
    private LivroSituacao situacao;
    private Livro livro;

    public Emprestimo() {
        this.dataDoEmprestimo = LocalDate.now();
        this.situacao = LivroSituacao.EMPRESTADO;
    }
 

    public LocalDate getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(LocalDate dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public LivroSituacao getSituacao() {
        return situacao;
    }

    public void setSituacao(LivroSituacao situacao) {
        this.situacao = situacao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
}
