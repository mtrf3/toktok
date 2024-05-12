package com.ss.bytertc.engine.type;

import X.X1D;

/* loaded from: classes33.dex */
public class VoiceReverbConfig {
    public float damping;
    public float decayTime;
    public float dryGain;
    public float preDelay;
    public float roomSize;
    public float wetGain;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceReverbConfig, room_size: ");
        LIZ.append(this.roomSize);
        LIZ.append(", decay_time: ");
        LIZ.append(this.decayTime);
        LIZ.append(", damping: ");
        LIZ.append(this.damping);
        LIZ.append(", wet_gain: ");
        LIZ.append(this.wetGain);
        LIZ.append(", dry_gain: ");
        LIZ.append(this.dryGain);
        LIZ.append(", pre_delay: ");
        LIZ.append(this.preDelay);
        return X1D.LIZIZ(LIZ);
    }

    public VoiceReverbConfig(float f, float f2, float f3, float f4, float f5, float f6) {
        this.roomSize = f;
        this.decayTime = f2;
        this.damping = f3;
        this.wetGain = f4;
        this.dryGain = f5;
        this.preDelay = f6;
    }
}
