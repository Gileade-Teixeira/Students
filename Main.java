import java.io.*;
class Main{
    public static void main(String args[]) throws java.io.IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int vezes;
        String nomeDisciplina;
        System.out.println("Informe o nome da disciplina: ");
        nomeDisciplina = in.readLine();
        
        int qntdAlunos; String aux;
        System.out.println("Informe a quantidade de alunos:");        
        aux = in.readLine();
        qntdAlunos = Integer.valueOf(aux).intValue();
        Disciplina disciplina = new Disciplina(qntdAlunos);
        
        System.out.println("ADICIONE ALUNOS");
        int matricula; String nomeAluno; float nota1, nota2, nota3;
        for(vezes=0; vezes<qntdAlunos; vezes++){            
            System.out.println("Informe a matricula do aluno:");
            aux = in.readLine();
            matricula = Integer.valueOf(aux).intValue();
            
            System.out.println("Informe o nome do aluno:");
            nomeAluno = in.readLine();
            
            System.out.println("Informe a nota 1 de "+nomeAluno+":");
            aux = in.readLine();
            nota1 = Float.valueOf(aux).floatValue();
            
            System.out.println("Informe a nota 2 de "+nomeAluno+":");
            aux = in.readLine();
            nota2 = Float.valueOf(aux).floatValue();
            
            System.out.println("Informe a nota 3 de "+nomeAluno+":");
            aux = in.readLine();
            nota3 = Float.valueOf(aux).floatValue();
            
            Aluno aluno = new Aluno(matricula, nomeAluno, nota1, nota2, nota3);
            disciplina.adicionaAluno(aluno);
            System.out.println("**************************************");
        }
        
        String tipoMedia; int matriculaAtual;
        System.out.println("Deseja calcular medias: 1-Automaticamente, 2-Manualmente?");
        tipoMedia = in.readLine();
        switch(tipoMedia){
            case "1":
                for(vezes=0; vezes<qntdAlunos; vezes++){
                    matriculaAtual = disciplina.retornarMatriculas(vezes);
                    disciplina.calculaMedia(matriculaAtual);
                }
                System.out.println("**************************************");
                break;
            case "2":
                for(vezes=0; vezes<qntdAlunos; vezes++){
                    System.out.println("Informe a matricula:");
                    aux = in.readLine();
                    matriculaAtual = Integer.valueOf(aux).intValue();
                    disciplina.calculaMedia(matriculaAtual);                    
                }
                System.out.println("**************************************");
                break;
        }
        
        System.out.println("Deseja saber aprovados? (1-SIM, 2-NAO)");
        tipoMedia = in.readLine();
        switch(tipoMedia){
            case "1":
                System.out.println("*****Aprovados em "+nomeDisciplina+"*****");        
                disciplina.mostraAprovados();
                System.out.println("**************************************");
                break;
            case "2":
                System.out.println("**************************************");
                break;
        }
        
        System.out.println("Deseja saber melhor aluno? (1-SIM, 2-NAO)");
        tipoMedia = in.readLine();
        switch(tipoMedia){
            case "1":
                int melhor = disciplina.achaMelhor();
                String nomeMelhor = disciplina.getAluno(melhor);
                System.out.println("Matricula do melhor aluno: "+melhor);
                System.out.println("Nome do melhor aluno: "+nomeMelhor);
                System.out.println("**************************************");
                break;
            case "2":
                System.out.println("**************************************");
                break;
        }
    }
}
