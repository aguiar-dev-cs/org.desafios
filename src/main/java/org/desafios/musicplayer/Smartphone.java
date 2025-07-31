package org.desafios.musicplayer;

public class Smartphone implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("Playing music: " + music);

    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing music: " + music);

    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music: " + music);

    }

    @Override
    public void playVideo() {
        System.out.println("Playing video: " + video);

    }

    @Override
    public void pauseVideo() {
        System.out.println("Pausing video: " + video);

    }

    @Override
    public void stopVideo() {
        System.out.println("Stopping video: " + video);

    }
}