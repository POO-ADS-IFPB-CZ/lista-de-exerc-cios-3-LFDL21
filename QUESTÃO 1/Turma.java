public class Turma {
    private Aluno[] alunos;
    private int quantidadeAlunos;

    public Turma(int capacidade) {
        alunos = new Aluno[capacidade];
        quantidadeAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        } else {
            System.out.println("A turma já está cheia.");
        }
    }

    public void listarAprovados() {
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].estaAprovado()) {
                System.out.println("- " + alunos[i].getNome() + " (Média: " + alunos[i].calcularMedia() + ")");
            }
        }
    }

    public void listarReprovados() {
        System.out.println("Alunos reprovados:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (!alunos[i].estaAprovado()) {
                System.out.println("- " + alunos[i].getNome() + " (Média: " + alunos[i].calcularMedia() + ")");
            }
        }
    }
}
