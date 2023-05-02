import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Dev Front End");
        curso1.setDescricao("Trabalhe com React");
        curso1.setCargaHoraria(20);

        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Dev de Sucesso");
        mentoria1.setDescricao("Aprenda na pratica");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
