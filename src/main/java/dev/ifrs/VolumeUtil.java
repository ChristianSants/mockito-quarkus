package dev.ifrs;

import dev.ifrs.AudioManager;

public class VolumeUtil {
    private AudioManager audioManager;

    public void maximizeVolume(int max) {
        audioManager.setVolume(max);
    }
}
