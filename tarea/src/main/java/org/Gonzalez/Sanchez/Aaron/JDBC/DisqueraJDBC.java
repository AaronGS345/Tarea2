package org.Gonzalez.Sanchez.Aaron.JDBC;


import org.Gonzalez.Sanchez.Aaron.model.Disquera;

import java.util.List;

public interface DisqueraJDBC
{

        List<Disquera> findAll();
        Disquera findById(Integer id);
        boolean save(Disquera disquera);
        boolean update(Disquera disquera);
        boolean delete(Disquera disquera);

}
