import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());

        //System.out.println(mentoria);
        //System.out.println(curso1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria);

        Dev devJoyce = new Dev();
        devJoyce.setNome("Joyce");
        devJoyce.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos incritos Joyce: " + devJoyce.getConteudosIncritos());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos incritos João: " + devJoao.getConteudosIncritos());

    }
}
