package com.ss.bytertc.engine.utils;

import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioSampleRate;

/* loaded from: classes33.dex */
public class AudioFrame {
    public byte[] buffer;
    public AudioChannel channel;
    public AudioSampleRate sampleRate;
    public int samples;

    public AudioFrame() {
    }

    public AudioFrame(byte[] bArr, int i, AudioSampleRate audioSampleRate, AudioChannel audioChannel) {
        this.buffer = bArr;
        this.samples = i;
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
    }
}
