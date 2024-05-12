package com.byted.cast.render.jitterbuffer;

/* loaded from: classes29.dex */
public interface JitterBufferListener {
    void onAVSmoothOutput(byte[] bArr, long j);

    void onAudioReadyToPlay();
}
