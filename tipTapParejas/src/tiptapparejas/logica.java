package tiptapparejas;

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;

public class logica {
private char tablero[][];
private char ganador;
private Usuarios jugador1, jugador2;
private boolean turnoX; //si es true es de X, si es false es de O
private boolean finDeJuego;
public static final char empate = ' ', jX='X', jO='O';

public logica(Usuarios jugador1, Usuarios jugador2){
    this.jugador1 = jugador1;
    this.jugador2 = jugador2;
    turnoX = true;
    finDeJuego = false;
    tablero = new char[3][3];
}

public boolean jugadas(int fila, int columna){
   if(finDeJuego || fila>2 || fila<0 || columna>2 || columna<0 || tablero[fila][columna]!= empate){
       return false;
   }
   if(turnoX){
       tablero[fila][columna] = jX;
   }else{
       tablero[fila][columna] = jO;
   }
   
   if(!finDeJuego){
       turnoX = false;
   }
   return true;
}
}
