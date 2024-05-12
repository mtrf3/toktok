package com.byted.cast.sdk.render.audio;

/* loaded from: classes29.dex */
public interface AudioJitterBufferCallback {
    void onAudioReadyToPlay();

    void onAudioSmoothOutput(byte[] bArr);
}
