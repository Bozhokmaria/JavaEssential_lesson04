package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("do u want to play or record music?");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();
        System.out.println("u can");

        switch (action){
            case "record":
                Recodable rec = new Player();
                rec.pause();
                rec.record();
                rec.stop();
                break;
            case "play":
                Playable play = new Player();
                play.pause();
                play.play();
                play.stop();
                break;
        }

    }
}
//output do u want to play or record music?
//play
//u can
//pause music
//play music
//stop music