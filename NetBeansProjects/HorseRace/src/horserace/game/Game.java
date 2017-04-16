/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horserace.game;

import horserace.models.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JerryJerr
 */
public class Game {
    private Stack stack;
    private Stack raceTrack;
    private int trackLength;
    
    public Game() {
        this.stack = new Stack(true);
        chooseParameters();
        this.raceTrack = new Stack(false);
        for (int i = 0; i < trackLength; i++) {
            raceTrack.getCards().add(stack.getCards().get(0));
            stack.getCards().remove(0);
        }
        
    }
    
    public  void chooseParameters() {
        Scanner input = new Scanner(System.in);
        System.out.print("track length: ");
        this.trackLength = input.nextInt();
    }
    
    public Stack getStack() {
        return this.stack;
    }

    public Stack getRaceTrack() {
        return raceTrack;
    }

    public int getTrackLength() {
        return trackLength;
    }
    
}
