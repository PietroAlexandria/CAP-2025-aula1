package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
   public Main() {
   }

   public static void main(String[] args) {

      System.out.println(" ---- Informações Aluno Unifio ---- ");

      //Aluno
      LocalDateTime agoraAluno = LocalDateTime.now();
      Long idAluno = Long.valueOf(agoraAluno.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
      Aluno a1 = new Aluno();
      a1.setId(idAluno);
      a1.setNome("Pietro");
      a1.setIdade(19);
      a1.setEndereco("Rua Tirusbangos, Centro");
      a1.setTelefone("(14) 99999-9999");
      a1.setDataNascimento("08/12/2005");

      //Curso
      LocalDateTime agoraCurso = LocalDateTime.now();
      Long idCs = Long.valueOf(agoraCurso.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
      Long idCurso = idCs + idCs;
      Curso c1 = new Curso();
      c1.setId(idCurso);
      c1.setNome("Engenharia de Software");
      c1.setDescricao("Curso noturno voltado para estudo de desenvolvimento fullstack.");
      c1.setDuracao("4 Anos");

      //Tarefa
      Tarefa t1 = new Tarefa();
      t1.setDescricao("Códigos de Alta Performance");
      t1.setConcluido(true);

      List<Atividade> agenda = new ArrayList<Atividade>();
      agenda.add(t1);

      Compromisso compromisso = new Compromisso();
      agenda.add(compromisso);

      System.out.println(" ================ ALUNO ================ ");
      System.out.println(" + ID: " + a1.getId());
      System.out.println(" + Nome: " + a1.getNome());
      System.out.println(" + Idade: " + a1.getIdade());
      System.out.println(" + Endereço: " + a1.getEndereco());
      System.out.println(" + Telefone: " + a1.getTelefone());
      System.out.println(" + Data de Nascimento: " + a1.getDataNascimento());
      System.out.println(" ======================================== ");

      System.out.println("\n ================ AGENDA ================= ");
      for (Atividade atividade : agenda) {
         System.out.println(" + Descrição: " + atividade.getDescricao());
      }
      System.out.println(" ======================================== ");

      System.out.println("\n ================ CURSO ================= ");
      System.out.println(" + ID: " + c1.getId());
      System.out.println(" + Nome: " + c1.getNome());
      System.out.println(" + Descrição: " + c1.getDescricao());
      System.out.println(" + Duração: " + c1.getDuracao());
      System.out.println(" ======================================== ");

      System.out.println("\n ================ TAREFA ================= ");
      System.out.println(" + Valor Descrição: " + t1.getDescricao());
      System.out.println(" + Valor Concluído: " + t1.isConcluido());
      System.out.println(" ======================================== ");

      System.out.println("\n ================ COMPROMISSO ================= ");
      for (Atividade atividade : agenda) {
         System.out.println(" + Descrição: " + atividade.getDescricao());
      }
      System.out.println(" + Valor Descrição: " + compromisso.getDescricao());
      System.out.println(" + Valor Data Inicial: " + compromisso.getDataInicial());
      System.out.println(" + Valor Data Final: " + compromisso.getDataFinal());
      System.out.println(" ======================================== ");

   }

}