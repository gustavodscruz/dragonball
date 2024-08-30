package br.com.fiap.bean;

import java.io.*;

public class DragonBallSuper {
    private String nome;
    private int KI, tecnicas, velocidade, transformacoes;

    public DragonBallSuper() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getKI() {
        return KI;
    }

    public void setKI(int KI) {
        this.KI = KI;
    }

    public int getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(int tecnicas) {
        this.tecnicas = tecnicas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getTransformacoes() {
        return transformacoes;
    }

    public void setTransformacoes(int transformacoes) {
        this.transformacoes = transformacoes;
    }


    public DragonBallSuper ler(String path) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path + "/" + "dragonball" + ".txt"));
            nome = br.readLine();
            KI = Integer.parseInt(br.readLine());
            tecnicas = Integer.parseInt(br.readLine());
            velocidade = Integer.parseInt(br.readLine());
            transformacoes = Integer.parseInt(br.readLine());
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!\n" + e.getMessage());
        }
        return this;
    }

    public String gravar (String path){
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdir();
        }
        try {
            PrintWriter pw = new PrintWriter(path + "/" + getNome() + ".txt");
            pw.println(getNome());
            pw.println(getKI());
            pw.println(getTecnicas());
            pw.println(getVelocidade());
            pw.println(getTransformacoes());
            pw.flush();
            pw.close();
            return "Arquivo gravado com sucesso!";
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!\n" + e.getMessage());
            return "Caminho não encontrado!";
        }
    }
}
