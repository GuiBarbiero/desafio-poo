import br.desafio.dominio.Curso;
import br.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso cursoNovo= new Curso();
        cursoNovo.setTitolo("Novo Curso de Lamba");
        cursoNovo.setDescricao("novo Curso na plataforma");
        cursoNovo.setCargaHoraria(76);

        Curso cursoNovo2= new Curso();
        cursoNovo2.setTitolo("Novo Curso Strings");
        cursoNovo2.setDescricao("novo Curso na plataforma");
        cursoNovo2.setCargaHoraria(51);

        Curso cursoNovo3= new Curso();
        cursoNovo3.setTitolo("Novo Curso cozinha");
        cursoNovo3.setDescricao("novo Curso na plataforma");
        cursoNovo3.setCargaHoraria(32);

        Curso cursoNovo4 = new Curso();
        cursoNovo4.setTitolo("Novo Curso fatoração");
        cursoNovo4.setDescricao("novo Curso na plataforma");
        cursoNovo4.setCargaHoraria(71);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitolo("Mentoria do curso XXXX");
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Descrição da mentoria ");
    }
}
