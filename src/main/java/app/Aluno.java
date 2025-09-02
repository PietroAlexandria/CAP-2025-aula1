package app;

import lombok.Generated;

public class Aluno {
   private long id;
   private String nome;
   private int idade;
   private String endereco;
   private String curso;
   private String telefone;
   private String dataNascimento;

   public Aluno() {
   }

   @Generated
   public long getId() {
      return this.id;
   }

   @Generated
   public String getNome() {
      return this.nome;
   }

   @Generated
   public int getIdade() {
      return this.idade;
   }

   @Generated
   public void setId(long id) {
      this.id = id;
   }

   @Generated
   public void setNome(String nome) {
      this.nome = nome;
   }

   @Generated
   public void setIdade(int idade) {
      this.idade = idade;
   }

   @Generated
   public String getEndereco() {
      return endereco;
   }

   @Generated
   public void setEndereco(String endereco) {
      this.endereco = endereco;
   }

   @Generated
   public String getCurso() {
      return curso;
   }

   @Generated
   public void setCurso(String curso) {
      this.curso = curso;
   }

   @Generated
   public String getTelefone() {
      return telefone;
   }

   @Generated
   public void setTelefone(String telefone) {
      this.telefone = telefone;
   }

   @Generated
   public String getDataNascimento() {
      return dataNascimento;
   }

   @Generated
   public void setDataNascimento(String dataNascimento) {
      this.dataNascimento = dataNascimento;
   }
}