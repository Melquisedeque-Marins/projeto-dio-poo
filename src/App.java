import java.time.LocalDate;

import domain.Curso;
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

        System.out.println(curso1);

    }
}
