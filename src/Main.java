import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Criando Cursos e Mentorias
        Curso curso1 = new Curso();
        curso1.setTitulo("Dev Front End");
        curso1.setDescricao("Trabalhe com React");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Dev Back End");
        curso2.setDescricao("Trabalhe com Node");
        curso2.setCargaHoraria(20);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Dev de Sucesso");
        mentoria1.setDescricao("Aprenda na pratica");
        mentoria1.setData(LocalDate.now());

        //Criando o BootCamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Dev FullStack");
        bootcamp.setDescricao("Desenvolva aplicacoes completas");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        //Criando Devs e Atribuindo aos Bootcamps
        Dev devMauricio = new Dev();
        devMauricio.setNome("Maurice");
        devMauricio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devMauricio.getNome() + ": " + devMauricio.getConteudosInscritos());
        devMauricio.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos " + devMauricio.getNome() + ": " + devMauricio.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devMauricio.getNome() + ": " + devMauricio.getConteudosConcluidos());
        System.out.println("XP :" + devMauricio.calcularTotalXp());

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devPaulo.getNome() + ": " + devPaulo.getConteudosInscritos());
        devPaulo.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos " + devPaulo.getNome() + ": " + devPaulo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devPaulo.getNome() + ": " + devPaulo.getConteudosConcluidos());
        System.out.println("XP :" + devPaulo.calcularTotalXp());

    }
}
