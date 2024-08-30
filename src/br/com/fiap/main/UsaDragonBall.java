package br.com.fiap.main;

import br.com.fiap.bean.DragonBallSuper;

import javax.swing.*;
import java.io.IOException;

public class UsaDragonBall {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Seja bem ao sistema de personagens de Dragon Ball Super!");
        String aux, nome, resposta, continuar = "sim";
        int opcao, tecnicas, KI, velocidade, transformacoes;
        DragonBallSuper dbs = new DragonBallSuper();

        do {
             aux = JOptionPane.showInputDialog("Operações: \n1 - Cadastrar personagem\n2 - Ver personagem");
             opcao = Integer.parseInt(aux);
             switch (opcao){
                 case 1:
                     nome = JOptionPane.showInputDialog("Nome: ");
                     tecnicas = Integer.parseInt(JOptionPane.showInputDialog("Número das técnicas: "));
                     KI = Integer.parseInt(JOptionPane.showInputDialog("Número do KI: "));
                     velocidade = Integer.parseInt(JOptionPane.showInputDialog("Número da velocidade: "));
                     transformacoes = Integer.parseInt(JOptionPane.showInputDialog("Número de transformações: "));
                     dbs.setNome(nome);
                     dbs.setKI(KI);
                     dbs.setTecnicas(tecnicas);
                     dbs.setVelocidade(velocidade);
                     dbs.setTransformacoes(transformacoes);
                     aux = JOptionPane.showInputDialog("Aonde deseja salvar o arquivo? Aponte para uma pasta existente!");
                     resposta = dbs.gravar(aux);
                     JOptionPane.showMessageDialog(null, resposta);
                     break;
                 case 2:

                     aux = JOptionPane.showInputDialog("Qual o caminho do arquivo do personagem? Escreva corretamente!");
                     try {
                         DragonBallSuper personagem = dbs.ler(aux);
                         JOptionPane.showMessageDialog(null, "Nome: " + dbs.getNome() + "\nKI: " + dbs.getKI() + "\nTécnicas" + dbs.getTecnicas() + "\nVelocidade: " + dbs.getTecnicas() + "\nTransformações: " + dbs.getTransformacoes());
                     } catch (IOException e) {
                         System.out.println("Erro: Caminho/arquivo não encontrado!\n" + e.getMessage());
                     }
                     break;
             }
             continuar = JOptionPane.showInputDialog("Deseja continuar?");
        }while(!continuar.equalsIgnoreCase("não"));
    }
}
