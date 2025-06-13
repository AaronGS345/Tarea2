package JDBC;

import org.Gonzalez.Sanchez.Aaron.JDBC.GeneroJDBC;
import org.Gonzalez.Sanchez.Aaron.JDBC.Impl.GeneroJDBCImpl;
import org.Gonzalez.Sanchez.Aaron.model.Genero;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.*;

class GeneroJDBCImplTest {

    @Test
    void getInstance()  {
        assertNotNull(GeneroJDBCImpl.getInstance());
    }

    @Test
    void findAll() {
        GeneroJDBC generoJDBC = GeneroJDBCImpl.getInstance();
        List<Genero> list = generoJDBC.findAll();
        if(list == null || list.isEmpty())
        {
            System.out.println("No hay elementos");
            return;
        }
        list.stream().forEach( e-> System.out.println(e.toString()));
        assertNotNull(list);
        assertTrue(list.size() >= 1);

    }

    @Test
    void save() {
        Genero genero = new Genero();
        boolean res = false;
        GeneroJDBC generoJDBC = GeneroJDBCImpl.getInstance();
        genero.setDescripcion("Regeton");
        res = generoJDBC.save(genero);
        assertEquals(true, res);
    }

    @Test
    void update() {
        Genero genero = new Genero();
        boolean res = false;
        genero.setDescripcion("Corridos");
        genero.setId(2);
        GeneroJDBC generoJDBC = GeneroJDBCImpl.getInstance();
        res = generoJDBC.update(genero);
        assertEquals(true, res);
    }

}