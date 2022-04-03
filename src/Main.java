import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
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

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscrecerBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Vitor:" + devVitor.getConteudoInscritos());
        devVitor.progredir();
        devVitor.progredir();
        devVitor.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Vitor:" + devVitor.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Vitor:" + devVitor.getConteudoConcluidos());
        System.out.println("XP:" + devVitor.calcularTotalXp());


        System.out.println("----------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscrecerBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Joao:" + devVitor.getConteudoConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}
