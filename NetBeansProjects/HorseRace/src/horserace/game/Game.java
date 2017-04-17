/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horserace.game;

import horserace.models.*;
import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author JerryJerr
 */
public class Game {

    private Stack stack;
    private Stack raceTrack;
    private int trackLength;
    private int spadePos;
    private int heartPos;
    private int clubsPos;
    private int diamoPos;
    private int turn;
    private int minPos;
    private Scanner input;

    /**
     *
     */
    public Game() {
        this.stack = new Stack(true);
        this.input = new Scanner(System.in);
        chooseParameters();
        this.raceTrack = new Stack(false);
        for (int i = 0; i < trackLength; i++) {
            raceTrack.getCards().add(stack.getCards().get(0));
            stack.getCards().remove(0);
        }
        this.turn = 0;
        this.minPos = 0;
        spadePos = 0;
        heartPos = 0;
        clubsPos = 0;
        diamoPos = 0;
        signalNextTurn();

    }

    /**
     * Will be called before the game starts, allows for user control over game
     * parameters.
     */
    public void chooseParameters() {

        System.out.print("track length: ");
        this.trackLength = input.nextInt();
    }

    public void signalNextTurn() {
        
        System.out.println("turn " + turn + ", next turn? ");
        this.input = new Scanner(System.in);
        if (input.hasNext()) {
            nextTurn();
        }
    }

    /**
     * Will be called every time the game advances 1 turn.
     */
    public void nextTurn() {
        
        Card nextCard = stack.getCards().get(turn);
        switch (nextCard.getSymbol()) {
            case "Spades":
                spadePos++;
                break;
            case "Hearts":
                heartPos++;
                break;
            case "Clubs":
                clubsPos++;
                break;
            case "Diamonds":
                diamoPos++;
                break;
            default:
                System.out.println("error: no such symbol");
                break;
        }
        System.out.println(stack.getCards().get(turn));
        printStatus();

        if (spadePos > trackLength || heartPos > trackLength || clubsPos > trackLength || diamoPos > trackLength) {
            finishGame();

        } else if (minPos < spadePos && minPos < heartPos && minPos < clubsPos && minPos < diamoPos) {
            Card trackCard = raceTrack.getCards().get(minPos);
            System.out.println("bets please...");
            input = new Scanner(System.in);
            if (input.hasNext()) {
                switch (trackCard.getSymbol()) {
                    case "Spades":
                        spadePos--;
                        break;
                    case "Hearts":
                        heartPos--;
                        break;
                    case "Clubs":
                        clubsPos--;
                        break;
                    case "Diamonds":
                        diamoPos--;
                        break;
                    default:
                        System.out.println("error: no such symbol");
                        break;
                }
                System.out.println(trackCard);
                printStatus();
                minPos++;
            }

        }
        
        turn++;
        if (spadePos <= trackLength && heartPos <= trackLength && clubsPos <= trackLength && diamoPos <= trackLength) {
            signalNextTurn();
        }
    }
    
    public void printStatus() {
        
        System.out.println(spadePos + "/" + trackLength
                + "  " + heartPos + "/" + trackLength + "  "
                + clubsPos + "/" + trackLength + "  " + diamoPos
                + "/" + trackLength);
                System.out.println(" S    H    C    D");
    }

    public void finishGame() {
        
        printStatus();
        System.out.println("new game? ");
        this.input = new Scanner(System.in);
//        if (input.hasNext()) {
//            turn = 0;
//            spadePos = 0;
//            heartPos = 0;
//            clubsPos = 0;
//            diamoPos = 0;
//            stack = new Stack(true);
//            
//            
//            signalNextTurn();
//        }

    }

    /**
     *
     * @return
     */
    public Stack getStack() {
        return this.stack;
    }

    /**
     *
     * @return
     */
    public Stack getRaceTrack() {
        return raceTrack;
    }

    /**
     *
     * @return
     */
    public int getTrackLength() {
        return trackLength;
    }

}
