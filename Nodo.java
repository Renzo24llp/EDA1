/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Nodo {
    int clave; // Dato almacenado
    Nodo siguiente; // Referencia al siguiente nodo
// Constructor
    public Nodo(int clave) {
        this.clave = clave; //para diferenciar el parametro del atributo
        this.siguiente = null;
        }
}
