import java.time.LocalDate;

import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Mentoria;
import br.com.dio.desafio.domain.Bootcamp;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição do curso Java na DIO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso Kotlin");
        curso1.setDescricao("descrição do curso Kotlin na DIO");
        curso1.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("Mentoria para o curso de Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Vitor:" + devVitor.getConteudosInscritos());
        devVitor.progredir();
        devVitor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Vitor:" + devVitor.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Vitor:" + devVitor.getConteudosConcluidos());
        System.out.println("XP:" + devVitor.calcularTotalXp());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
