package task2;

public class Player implements Playable, Recodable{

    @Override
    public void play() {
        System.out.println("play music");
    }

    @Override
    public void pause() {
        System.out.println("pause music");
    }

    @Override
    public void stop() {
        System.out.println("stop music");
    }

    @Override
    public void record() {
        System.out.println("record music");
    }
}
