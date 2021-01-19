public class Disciplina
{
    private Aluno[] alunos;
    private int contador;
    public Disciplina(int quantidadeAlunos){
        alunos = new Aluno[quantidadeAlunos];
        contador = 0;
    }
    public void adicionaAluno(Aluno aluno){
        alunos[contador] = aluno;
        contador++;
    }
    public void calculaMedia(int matricula){
        String resultado = "ERRO! Matricula nao existe!";
        for(int aux=0; aux<alunos.length; aux++){
            if(alunos[aux].getmatricula()==matricula){
                float media = (alunos[aux].getnota1() + alunos[aux].getnota2() + alunos[aux].getnota3())/3;
                alunos[aux].setmedia(media);
                resultado = "Media Calculada!";
            }
        }
        System.out.println(resultado);
    }
    public void mostraAprovados(){
        int total = 0;
        for(int aux=0; aux<alunos.length; aux++){
            if(alunos[aux].getmedia()>=7.0){
                total++;
                System.out.println(total + "- Nome: " + alunos[aux].getnome() + ", Matricula: " + alunos[aux].getmatricula() + ", Media: " + alunos[aux].getmedia() +
                                   "(Nota 1 = " + alunos[aux].getnota1() + ", Nota 2 = " + alunos[aux].getnota2() + ", Nota 3 = " + alunos[aux].getnota3() + ")" );            
            }
        }
    }
    public int achaMelhor(){
        float atual = 0;
        float maior = 0;
        int matricula = 0;
        for(int aux=0; aux<alunos.length; aux++){
            atual = alunos[aux].getmedia();
            if(atual>maior){
                maior = atual;
                matricula = alunos[aux].getmatricula();
            }
        }
        return matricula;
    }
    public int retornarMatriculas(int contador){
        do{
            return alunos[contador].getmatricula();
        }while(contador<alunos.length);
    }
    public String getAluno(int matricula){
        String nomeAluno = "Aluno nao existe!";
        for(int aux=0; aux<alunos.length; aux++){
            if(alunos[aux].getmatricula()==matricula){
                nomeAluno = alunos[aux].getnome();
                break;
            }
        }
        return nomeAluno;
    }
}
