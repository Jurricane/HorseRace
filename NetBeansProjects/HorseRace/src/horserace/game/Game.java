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
    private int spadePos;
    private int heartPos;
    private int clubsPos;
    private int diamoPos;
    private int turn;
    private int minPos;

    /**
     *
     */
    public Game() {
        this.stack = new Stack(true);
        chooseParameters();
        this.raceTrack = new Stack(false);
        for (int i = 0; i < trackLength; i++) {
            raceTrack.getCards().add(stack.getCards().get(0));
            stack.getCards().remove(0);
            this.turn = 0;
            this.minPos = 0;
        }

    }

    /**
     * Will be called before the game starts, allows for user control over
     * game parameters.
     */
    public void chooseParameters() {
        Scanner input = new Scanner(System.in);
        System.out.print("track length: ");
        this.trackLength = input.nextInt();
    }

    /**
     *  Will be called every time the game advances 1 turn.
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

        if (minPos < spadePos && minPos < heartPos && minPos < clubsPos && minPos < diamoPos) {
            Card trackCard = raceTrack.getCards().get(minPos);
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
            minPos++;

        }
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
