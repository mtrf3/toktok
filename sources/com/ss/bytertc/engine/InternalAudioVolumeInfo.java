package com.ss.bytertc.engine;

/* loaded from: classes33.dex */
public class InternalAudioVolumeInfo {
    public int linearVolume;
    public int nonlinearVolume;
    public int smoothVolume;
    public String uid;

    public InternalAudioVolumeInfo(String str, int i, int i2) {
        this.uid = str;
        this.linearVolume = i;
        this.nonlinearVolume = i2;
    }

    public static InternalAudioVolumeInfo create(String str, int i, int i2) {
        return new InternalAudioVolumeInfo(str, i, i2);
    }
}
