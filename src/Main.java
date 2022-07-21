import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)  {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçâo curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçâo curso js");
        curso2.setCargaHoraria(4);


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

        Dev devSamara = new Dev();
        devSamara.setNome("Samara");
        devSamara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Samara" + devSamara.getConteudosInscritos());
        devSamara.progredir();
        devSamara.progredir();
        devSamara.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos Samara" + devSamara.getConteudosConcluidos());
        System.out.println("XP:" + devSamara.calcularTotalXp());

        System.out.println("--------------------------------");

        Dev devSamuel = new Dev();
        devSamuel.setNome("Samuel");
        devSamuel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Samuel" + devSamuel.getConteudosInscritos());
        devSamuel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos Samuel" + devSamuel.getConteudosConcluidos());
        System.out.println("XP:" + devSamuel.calcularTotalXp());





    }
}
