package br.com.fiap.bean;

import javax.swing.*;
import java.io.IOException;

public interface IDBSuper {
    public DragonBallSuper ler(String path) throws IOException;
    public String gravar(String path);

}
