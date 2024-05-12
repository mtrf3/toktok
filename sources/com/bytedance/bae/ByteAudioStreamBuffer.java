package com.bytedance.bae;

import java.nio.ByteBuffer;

/* loaded from: classes17.dex */
public class ByteAudioStreamBuffer {
    public ByteBuffer data;
    public int length;
    public ByteAudioStreamFormat streamFormat;
    public int timestamp;

    public ByteBuffer getData() {
        return this.data;
    }

    public int getLength() {
        return this.length;
    }

    public ByteAudioStreamFormat getStreamFormat() {
        return this.streamFormat;
    }

    public int getTimestamp() {
        return this.timestamp;
    }

    public void setLength(int i) {
        this.length = i;
    }

    public void setTimestamp(int i) {
        this.timestamp = i;
    }

    public ByteAudioStreamBuffer(ByteBuffer byteBuffer, int i, ByteAudioStreamFormat byteAudioStreamFormat, int i2) {
        this.data = byteBuffer;
        this.length = i;
        this.streamFormat = byteAudioStreamFormat;
        this.timestamp = i2;
    }

    public static ByteAudioStreamBuffer create(ByteBuffer byteBuffer, int i, ByteAudioStreamFormat byteAudioStreamFormat, int i2) {
        return new ByteAudioStreamBuffer(byteBuffer, i, byteAudioStreamFormat, i2);
    }
}
