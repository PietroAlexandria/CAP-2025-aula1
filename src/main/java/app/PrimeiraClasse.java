package app;

public class PrimeiraClasse {
    public static void main(String[] args){
        System.out.println("Hello Gradle!!!");

        Aluno a1 = new Aluno();
        a1.setId(1);
        a1.setNome("Pietro");
        a1.setIdade(19);

        System.out.println(a1.getNome());
    }
}