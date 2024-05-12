package com.ss.bytertc.engine.type;

import X.X1D;

/* loaded from: classes33.dex */
public class VoiceEqualizationConfig {
    public VoiceEqualizationBandFrequency frequency;
    public int gain;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("the frequency: ");
        LIZ.append(this.frequency);
        LIZ.append(", the gain: ");
        LIZ.append(this.gain);
        return X1D.LIZIZ(LIZ);
    }

    public VoiceEqualizationConfig(VoiceEqualizationBandFrequency voiceEqualizationBandFrequency, int i) {
        this.frequency = voiceEqualizationBandFrequency;
        this.gain = i;
    }
}
