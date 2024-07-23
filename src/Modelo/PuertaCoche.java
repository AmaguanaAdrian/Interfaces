/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER
 */
public class PuertaCoche extends ComponentesCoche implements PuertaBloqueable, Alarma {
    private boolean estaBloqueada;
    private boolean alarmaActivada;

    public PuertaCoche() {
    }

    public PuertaCoche(String descripcion, double peso, double coste) {
        super(descripcion, peso, coste);
        this.estaBloqueada = false;
        this.alarmaActivada = false;
    }

    @Override
    public void abrir() {
        if (!estaBloqueada) {
            System.out.println("Puerta abierta.");
        } else {
            System.out.println("La puerta está bloqueada, no se puede abrir.");
        }
    }

    @Override
    public void cerrar() {
        System.out.println("Puerta cerrada.");
    }

    @Override
    public void bloquea() {
        estaBloqueada = true;
        System.out.println("Puerta bloqueada.");
    }

    @Override
    public void desbloquea() {
        estaBloqueada = false;
        System.out.println("Puerta desbloqueada.");
    }

    @Override
    public boolean alarmaActivada() {
        return alarmaActivada;
    }

    @Override
    public void activarAlarma() {
        alarmaActivada = true;
        System.out.println("Alarma activada.");
    }

    @Override
    public void desactivarAlarma() {
        alarmaActivada = false;
        System.out.println("Alarma desactivada.");
    }
}