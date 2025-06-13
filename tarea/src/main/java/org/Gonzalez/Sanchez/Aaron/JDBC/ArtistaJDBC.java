package org.Gonzalez.Sanchez.Aaron.JDBC;

import org.Gonzalez.Sanchez.Aaron.model.Artista;

import java.util.List;

public interface ArtistaJDBC
{
    List<Artista> findAll();
    Artista findById(Integer id);
    boolean save(Artista artista);
    boolean update(Artista artista);
    boolean delete(Artista artista);
}
