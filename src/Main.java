import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

      /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos do Bruno: " + devBruno.getConteudosInscritos());
        devBruno.progredir();
        devBruno.progredir();
        System.out.println("Conteudos Inscritos do Bruno: " + devBruno.getConteudosInscritos());
        System.out.println("Conteudos Concluidos do Bruno: " + devBruno.getConteudosConcluidos());
        System.out.println("XP: " + devBruno.calcularXp());

        Dev devMarina = new Dev();
        devMarina.setNome("Marina");
        devMarina.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos da Marina: " + devMarina.getConteudosInscritos());
        devMarina.progredir();
        System.out.println("Conteudos Concluidos da Marina: " + devMarina.getConteudosConcluidos());
        System.out.println("XP: " + devMarina.calcularXp());



    }
}