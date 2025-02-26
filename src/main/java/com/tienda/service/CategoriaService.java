package com.tienda.service;
import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    //Se obtiene el listado de la Base de Datos.
    public List<Categoria> getCategorias(boolean activos);
    
}
