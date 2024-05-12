package com.ss.bytertc.engine.data;

import X.X1D;

/* loaded from: classes33.dex */
public class AudioEffectPlayerConfig {
    public int pitch;
    public int playCount;
    public int startPos;
    public AudioMixingType type;

    public AudioEffectPlayerConfig() {
        this.type = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH;
        this.playCount = 1;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioEffectPlayerConfig{type='");
        LIZ.append(this.type);
        LIZ.append('\'');
        LIZ.append(", playCount='");
        LIZ.append(this.playCount);
        LIZ.append('\'');
        LIZ.append(", startPos='");
        LIZ.append(this.startPos);
        LIZ.append('\'');
        LIZ.append(", pitch='");
        LIZ.append(this.pitch);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public AudioEffectPlayerConfig(AudioMixingType audioMixingType, int i, int i2, int i3) {
        this.type = audioMixingType;
        this.playCount = i;
        this.startPos = i2;
        this.pitch = i3;
    }
}
