public class Aluno
{
    private int matricula;
    private String nome;
    private float nota1, nota2, nota3, media;
    public Aluno(int matricula, String nome, float nota1, float nota2, float nota3){
        media=0;
        this.matricula=matricula;
        this.nome=nome;
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
    }
    public String getnome(){
        return nome;
    }
    public int getmatricula(){
        return matricula;
    }
    public float getnota1(){
        return nota1;
    }
    public float getnota2(){
        return nota2;
    }
    public float getnota3(){
        return nota3;
    }
    public void setmedia(float media){
        this.media = media;
    }
    public float getmedia(){
        return media;
    }
}
