package com.byted.cast.mediacommon.render;

/* loaded from: classes29.dex */
public interface IAudioFrameListener {
    void onAudioOutput(String str, int i, byte[] bArr, int i2, int i3, int i4, int i5, long j);

    void onError(String str, int i, int i2);
}
