package com.mammon.audiosdk.structures;

/* loaded from: classes15.dex */
public class SAMICoreAudioConfig {
    public int channel;
    public String format;
    public int sampleRate;

    public void setAudioConfig(int i, int i2, String str) {
        this.sampleRate = i;
        this.channel = i2;
        this.format = str;
    }
}
