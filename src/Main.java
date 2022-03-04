import br.com.dio.desafio.*;

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

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria JAVA");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());

        mentoria.setTitulo("Mentoria JS");
        mentoria.setDescricao("Descrição mentoria JS");
        mentoria.setData(LocalDate.now());

      //  System.out.println(mentoria1);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp de Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCide = new Dev();
        devCide.setNome("Cide");
        devCide.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos " + devCide.getNome()+" - " + devCide.getConteudosInscritos());
        devCide.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos " + devCide.getNome()+" - " + devCide.getConteudosInscritos());
        System.out.println("Conteúdo Concluídos " + devCide.getNome()+" - " + devCide.getConteudosConcluidos());

        System.out.println("-----------------");

        Dev devJoyce = new Dev();
        devJoyce.setNome("Joyce");
        devJoyce.inscreverBootcamp(bootcamp);
        System.out.println("-");
        System.out.println("Conteúdo Inscritos " + devJoyce.getConteudosInscritos());
        System.out.println("Conteúdo Concluídos " + devJoyce.getConteudosConcluidos());




    }
}
