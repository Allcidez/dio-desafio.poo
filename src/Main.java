import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição do Curso java DIO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do Curso JS DIO");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria JAVA");
        mentoria1.setDescricao("Descrição mentoria JAVA");
        mentoria1.setData(LocalDate.now());

        mentoria1.setTitulo("Mentoria JS");
        mentoria1.setDescricao("Descrição mentoria JS");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

    }
}
