public class Usina {

    String nome;
    int potenciaMax;
    int geracaoAtual;


    public Usina() {
        nome = "sem nome";
        potenciaMax= 0;
        geracaoAtual = 0;
    }


    public Usina(String nome, int potenciaMax, int geracaoAtual) {
        this.nome = nome;
        this.potenciaMax= potenciaMax;
        this.geracaoAtual = geracaoAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    public int getGeracaoAtual() {
        return geracaoAtual;
    }

    public void setGeracaoAtual(int geracaoAtual) {
        this.geracaoAtual = geracaoAtual;
    }

    public void mostrarUsina(){
        System.out.println(nome);
        System.out.println(potenciaMax);
        System.out.println(geracaoAtual);
    }


}
