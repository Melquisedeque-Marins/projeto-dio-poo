import java.time.LocalDate;

import domain.Bootcamp;
import domain.Curso;
import domain.Dev;
import domain.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();

        curso1.setTitulo("java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("java script");
        curso2.setDescricao("descricao curso java script");
        curso2.setCargaHoraria(16);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("bootcamp java developer");
        bootcamp.setDescricao("descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev melck = new Dev();
        melck.setName("melck");
        melck.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos melck" + melck.getConteudosInscritos());
        melck.progredir();
        System.out.println("conteudos inscritos melck" + melck.getConteudosInscritos());
        System.out.println("conteudos concluidos melck" + melck.getConteudosConcluidos());
        System.out.println("XP: " + melck.calcularTotalXp());

        Dev raissa = new Dev();
        raissa.setName("Raissa");
        raissa.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos Raissa" + raissa.getConteudosInscritos());
        raissa.progredir();
        System.out.println("conteudos inscritos Raissa" + raissa.getConteudosInscritos());
        System.out.println("conteudos concluidos melck" + raissa.getConteudosConcluidos());
        System.out.println("XP: " + raissa.calcularTotalXp());

    }
}
