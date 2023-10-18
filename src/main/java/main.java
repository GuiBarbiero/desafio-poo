import br.desafio.dominio.*;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso cursoNovo= new Curso();
        cursoNovo.setTitulo("Novo Curso de Lamba");
        cursoNovo.setDescricao("novo Curso na plataforma");
        cursoNovo.setCargaHoraria(76);

        Curso cursoNovo2= new Curso();
        cursoNovo2.setTitulo("Novo Curso Strings");
        cursoNovo2.setDescricao("novo Curso na plataforma");
        cursoNovo2.setCargaHoraria(51);

        Curso cursoNovo3= new Curso();
        cursoNovo3.setTitulo("Novo Curso cozinha");
        cursoNovo3.setDescricao("novo Curso na plataforma");
        cursoNovo3.setCargaHoraria(32);

        Curso cursoNovo4 = new Curso();
        cursoNovo4.setTitulo("Novo Curso fatoração");
        cursoNovo4.setDescricao("novo Curso na plataforma");
        cursoNovo4.setCargaHoraria(71);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do curso XXXX");
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Descrição da mentoria ");

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Lambda");
        bootCamp.setDescricao("XXXXXXXXX");
        bootCamp.getConteudos().add(cursoNovo2);
        bootCamp.getConteudos().add(cursoNovo3);
        bootCamp.getConteudos().add(cursoNovo4);
        bootCamp.getConteudos().add(mentoria);

        Developer DevGui = new Developer();
        DevGui.setNomeDev("Gui");
        DevGui.InscreverNoBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos" + DevGui.getConteudosInscritos());

        DevGui.progrecao();

        System.out.println("Conteudos concluidos" + DevGui.getConteudoConcluido());
        System.out.println("Conteudos concluidos" + DevGui.getConteudoConcluido());
        System.out.println("XP" + DevGui.xp_total());

        Developer DevJu = new Developer();

        DevJu.setNomeDev("Julia");
        DevJu.InscreverNoBootCamp(bootCamp);

        System.out.println("Conteudos Inscritos" + DevJu.getConteudosInscritos());
        DevJu.progrecao();

        System.out.println("Conteudos concluidos" + DevJu.getConteudoConcluido());
        System.out.println("Conteudos concluidos" + DevJu.getConteudoConcluido());
        System.out.println("XP" + DevJu.xp_total());
    }
}
