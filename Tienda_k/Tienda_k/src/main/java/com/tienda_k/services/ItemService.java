/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda_k.services;

import com.tienda_k.domain.Item;
import java.util.ArrayList;
import java.util.List;

public interface ItemService {     
    List<Item> listaItems = new ArrayList<>();
    
    public List<Item> gets();
    
    //Se recupera el registro que tiene el idItem pasado por parÃ¡metro
    //si no existe en la tabla se retorna null
    public Item get(Item item);
    
    //Se elimina el registro que tiene el idItem pasado por parÃ¡metro
    public void delete(Item item);
    
    //Si el objeto item tiene un idItem que existe en la tabla item
    //El registro de actualiza con la nueva informaciÃ³n
    //Si el idItem NO existe en la tabla, se crea el registro con esa informaciÃ³n
    public void save(Item item);
    
    public void actualiza(Item item);
    
    public void facturar();
}
