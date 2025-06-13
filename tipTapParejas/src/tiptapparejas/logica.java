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
   
   if(verificar()){
       finDeJuego=true;
       if(turnoX){
           ganador = jX;
       }else{
           ganador = jO;
       }
   }else if(tableroCompletado()){
       finDeJuego = true;
       ganador = empate;
   }
   
   if(!finDeJuego){
       turnoX = false;
   }
   return true;
}

private boolean verificar(){
    char ficha;
    if(turnoX){
        ficha = jX;
    }else{
        ficha = jO;
    }
    for (int i = 0; i < 3; i++) {
        if(tablero[i][0]==ficha&&tablero[i][1]==ficha&&tablero[i][2]==ficha){
            return true;
        }
    }
    for (int i = 0; i < 3; i++) {
        if(tablero[0][i]==ficha&&tablero[1][i]==ficha&&tablero[2][i]==ficha){
            return true;
        }
    }
    if(tablero[0][0]==ficha&&tablero[1][1]==ficha&&tablero[2][2]==ficha){
            return true;
        }
    if(tablero[0][2]==ficha&&tablero[1][1]==ficha&&tablero[2][0]==ficha){
            return true;
        }
   return false;
}

public void reiniciar(){
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            tablero[i][j] = empate;
        }
        ganador = empate;
        turnoX = true;
        finDeJuego = false;
    }
}

public char getCaseta(int fila, int columna){
    return tablero[fila][columna];
}
public Usuarios getJugadorActual(){
    if(turnoX){
        return jugador1;
    }else{
        return jugador2;
    }
}

public Usuarios getJugador1(){
    return jugador1;
}
public Usuarios getJugador2(){
    return jugador2;
}

private boolean tableroCompletado(){
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if(tablero[i][j]==empate){
                return false;
            }
        }
    }
    return true;
}
public boolean isFin(){
    return finDeJuego;
}
public char getGane(){
    return ganador;
}
}
