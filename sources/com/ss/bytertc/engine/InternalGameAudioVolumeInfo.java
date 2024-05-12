package com.ss.bytertc.engine;

/* loaded from: classes33.dex */
public class InternalGameAudioVolumeInfo {
    public String userId;
    public int volume;

    public InternalGameAudioVolumeInfo(String str, int i) {
        this.userId = str;
        this.volume = i;
    }

    public static InternalGameAudioVolumeInfo create(String str, int i) {
        return new InternalGameAudioVolumeInfo(str, i);
    }
}
