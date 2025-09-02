package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrimeiraClasse {
   public PrimeiraClasse() {
   }

   public static void main(String[] args) {

      System.out.println(" -- Informações Aluno Unifio -- ");

      LocalDateTime agora = LocalDateTime.now();
      Long id = Long.valueOf(agora.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));

      Aluno a1 = new Aluno();
      String nome = "Gustavo";
      int idade = 21;
      String endereco = "Rua Tirusbangos, Centro";
      String curso = "Engenharia de Software";
      String telefone = "(43) 99999-9999";
      String dataNascimento = "25/01/2000";

      a1.setId(id);
      a1.setNome(nome);
      a1.setIdade(idade);
      a1.setEndereco(endereco);
      a1.setCurso(curso);
      a1.setTelefone(telefone);
      a1.setDataNascimento(dataNascimento);

      System.out.println(" ================ ALUNO ================ ");
      System.out.println(" + ID: " + a1.getId());
      System.out.println(" + Nome: " + a1.getNome());
      System.out.println(" + Idade: " + a1.getIdade());
      System.out.println(" + Endereço: " + a1.getEndereco());
      System.out.println(" + Curso: " + a1.getCurso());
      System.out.println(" + Telefone: " + a1.getTelefone());
      System.out.println(" + Data de Nascimento: " + a1.getDataNascimento());
      System.out.println(" ======================================== ");
   }
}