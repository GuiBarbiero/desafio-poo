package br.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Developer {

    private String NomeDev;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public void InscreverNoBootCamp(BootCamp bootCamp) {
        this.conteudosInscritos.addAll(bootCamp.getConteudos());
        bootCamp.getDevsParticipantes().add(this);
    }

    public void progrecao() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();// pegando o primeiro conteudo
        if (conteudo.isPresent()) {
            this.conteudoConcluido.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum Boot ou conteudo");
        }
    }

    public double xp_total(){
        return this.conteudoConcluido
                .stream()
                .mapToDouble(Conteudo::calculoDeExperiencia)
                .sum();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Developer)) return false;
        Developer developer = (Developer) object;
        return Objects.equals(NomeDev, developer.NomeDev) && Objects.equals(conteudosInscritos, developer.conteudosInscritos) && Objects.equals(conteudoConcluido, developer.conteudoConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NomeDev, conteudosInscritos, conteudoConcluido);
    }

    public String getNomeDev() {
        return NomeDev;
    }

    public void setNomeDev(String nomeDev) {
        NomeDev = nomeDev;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }
}

