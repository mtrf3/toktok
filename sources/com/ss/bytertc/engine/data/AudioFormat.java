package com.ss.bytertc.engine.data;

import X.X1D;

/* loaded from: classes33.dex */
public class AudioFormat {
    public AudioChannel channel;
    public AudioSampleRate sampleRate;
    public int samplesPerCall;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioFormat{sampleRate='");
        LIZ.append(this.sampleRate);
        LIZ.append('\'');
        LIZ.append(", channel='");
        LIZ.append(this.channel);
        LIZ.append('\'');
        LIZ.append(", samplesPerCall=");
        LIZ.append(this.samplesPerCall);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public AudioFormat(AudioSampleRate audioSampleRate, AudioChannel audioChannel) {
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
    }

    public AudioFormat(AudioSampleRate audioSampleRate, AudioChannel audioChannel, int i) {
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
        this.samplesPerCall = i;
    }
}
